package com.APIProject.apiProject.service.security;

import com.APIProject.apiProject.domain.security.Role;
import com.APIProject.apiProject.domain.security.User;
import com.APIProject.apiProject.dto.security.RegisterUserDTO;
import com.APIProject.apiProject.exceptions.security.DuplicatedUserException;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import static com.APIProject.apiProject.commons.Constants.JWT_ID;
import static com.APIProject.apiProject.commons.Constants.SECRET_KEY;

@Service
public class SessionService {
    @Autowired
    private UserService userService;

    @Autowired
    private PasswordEncoder encoder;

    public boolean validateUser(String email, String password) {
        Optional<User> user = userService.findByEmail(email);
        if (user.isPresent()) {
            return encoder.matches(password, user.get().getPassword());
        } else return false;

    }

    public String buildToken(String username) {
        User user = userService.findByEmail(username).get();

        List<GrantedAuthority> grantedAuthorities = AuthorityUtils
                .commaSeparatedStringToAuthorityList(user.getRoles().stream()
                        .map(Role::getRole).collect(Collectors.joining(",")));

        String token = Jwts
                .builder()
                .setId(JWT_ID)
                .setSubject(username)
                .claim("authorities",
                        grantedAuthorities.stream()
                                .map(GrantedAuthority::getAuthority)
                                .collect(Collectors.toList()))
                .setIssuedAt(new Date(System.currentTimeMillis()))
                .setExpiration(new Date(System.currentTimeMillis() + 3_600_000))//1 hour
                .signWith(SignatureAlgorithm.HS512,
                        SECRET_KEY.getBytes()).compact();

        return "Bearer " + token;

    }

    public void createUser(RegisterUserDTO register) {
        if(userService.findByEmail(register.getEmail()).isPresent()){
            throw new DuplicatedUserException();
        }
        User user = new User();
        user.setEmail(register.getEmail());
        user.setName(register.getName());
        user.setLastName(register.getLastName());
        user.setActive(true);
        user.setPassword(encoder.encode((register.getPassword())));
        userService.save(user);
    }
}
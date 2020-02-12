package com.APIProject.apiProject.service;


import com.APIProject.apiProject.domain.business.Supporter;
import com.APIProject.apiProject.exceptions.RecordNotFoundException;
import com.APIProject.apiProject.repository.SupporterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SupporterService {
    @Autowired
    private SupporterRepository repository;

    public Supporter save(Supporter supp) {
        return repository.save(supp);
    }

    public Supporter update(Supporter supp) {
        find(supp.getId());
        return repository.save(supp);
    }

    public void delete(Integer id) {
        repository.deleteById(id);
    }

    public List<Supporter> findAll() {
        return repository.findAll();
    }

    public Supporter find(Integer id) {
        return repository
                .findById(id)
                .orElseThrow(
                        () -> new RecordNotFoundException(Supporter.class.getName()));
    }
}










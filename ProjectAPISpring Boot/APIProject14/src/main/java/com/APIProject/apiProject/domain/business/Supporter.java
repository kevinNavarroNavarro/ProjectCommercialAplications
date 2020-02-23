package com.APIProject.apiProject.domain.business;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import java.util.List;

@Entity
@Table(name="Supporter")
public class Supporter {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotNull
    @Column(name = "name")
    private String name;

    @NotNull
    @Column(name = "first_surname")
    private String firstSurname;

    @NotNull
    @Column(name = "second_surname")
    private String secondSurname;

    @NotNull
    @Column(name = "email")
    @Email
    private String email;

    @NotNull
    @Column(name = "password")
    private String password;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_service", nullable = false)
    private SService service;

    @OneToMany(mappedBy = "idSupport", fetch = FetchType.LAZY)
    private List<Notes> notes;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_supervisor", nullable = false)
    private Supervisor supervisor;

    @OneToOne(mappedBy = "supporter", fetch = FetchType.LAZY)
    private SIssue issue;

    //Getters and Setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFirstSurname() {
        return firstSurname;
    }

    public void setFirstSurname(String firstSurname) {
        this.firstSurname = firstSurname;
    }

    public String getSecondSurname() {
        return secondSurname;
    }

    public void setSecondSurname(String secondSurname) {
        this.secondSurname = secondSurname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public SService getService() {
        return service;
    }

    public void setService(SService service) {
        this.service = service;
    }

    public List<Notes> getNotes() {
        return notes;
    }

    public void setNotes(List<Notes> notes) { this.notes = notes; }

    public Supervisor getSupporter() {
        return supervisor;
    }

    public void setSupporter(Supervisor supporter) {
        this.supervisor = supporter;
    }

    public SIssue getIssue() {
        return issue;
    }

    public void setIssue(SIssue issue) {
        this.issue = issue;
    }

    public Supervisor getSupervisor() {
        return supervisor;
    }

    public void setSupervisor(Supervisor supervisor) {
        this.supervisor = supervisor;
    }

    // toString
    @Override
    public String toString() {
        return "Supporter{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", firstSurname='" + firstSurname + '\'' +
                ", secondSurname='" + secondSurname + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", service=" + service +
                ", notes=" + notes +
                ", supporter=" + supervisor +
                ", issue=" + issue +
                '}';
    }
}
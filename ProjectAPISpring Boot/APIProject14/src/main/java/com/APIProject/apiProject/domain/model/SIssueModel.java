package com.APIProject.apiProject.domain.model;

import static com.APIProject.apiProject.util.JsonUtil.toJson;

public class SIssueModel {
    private String address;
    private String client;
    private String notes;
    private String email;
    private String phone;
    private String description;
    private Integer id;
    private Integer idClient;
    private String reportTimestamp;
    private String service;
    private String status;
    private Integer supportUserAssigned;

    //Getters and Setters

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getClient() {
        return client;
    }

    public void setClient(String client) {
        this.client = client;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getIdClient() {
        return idClient;
    }

    public void setIdClient(Integer idClient) {
        this.idClient = idClient;
    }

    public String getReportTimestamp() {
        return reportTimestamp;
    }

    public void setReportTimestamp(String reportTimestamp) {
        this.reportTimestamp = reportTimestamp;
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getSupportUserAssigned() {
        return supportUserAssigned;
    }

    public void setSupportUserAssigned(Integer supportUserAssigned) {
        this.supportUserAssigned = supportUserAssigned;
    }

    @Override
    public String toString(){ return toJson(this);}
}
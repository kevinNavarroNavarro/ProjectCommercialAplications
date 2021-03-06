package com.APIProject.apiProject.dto;

import java.util.Date;
import java.util.List;

public class SIssueDTO {

    public static class Response {
        private Integer id;

        private Integer reportNumber;

        private String classification;

        private String status;

        private Date reportTimeStamp;

        private String resolutionComment;

        private List<Integer> notes;

        private SupporterDTO.Response idSupporter;

        private SupervisorDTO.Response idSupervisor;

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public Integer getReportNumber() {
            return reportNumber;
        }

        public void setReportNumber(Integer reportNumber) {
            this.reportNumber = reportNumber;
        }

        public String getClassification() {
            return classification;
        }

        public void setClassification(String classification) {
            this.classification = classification;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public Date getReportTimeStamp() {
            return reportTimeStamp;
        }

        public void setReportTimeStamp(Date reportTimeStamp) {
            this.reportTimeStamp = reportTimeStamp;
        }

        public String getResolutionComment() {
            return resolutionComment;
        }

        public void setResolutionComment(String resolutionComment) {
            this.resolutionComment = resolutionComment;
        }

        public SupporterDTO.Response getIdSupporter() {
            return idSupporter;
        }

        public void setIdSupporter(SupporterDTO.Response idSupporter) {
            this.idSupporter = idSupporter;
        }

        public SupervisorDTO.Response getIdSupervisor() {
            return idSupervisor;
        }

        public void setIdSupervisor(SupervisorDTO.Response idSupervisor) {
            this.idSupervisor = idSupervisor;
        }

        public List<Integer> getNotes() {
            return notes;
        }

        public void setNotes(List<Integer> notes) {
            this.notes = notes;
        }
    }

    public static class Request {
        private Integer id;

        private Integer reportNumber;

        private String classification;

        private String status;

        private Date reportTimeStamp;

        private String resolutionComment;

        private List<Integer>  notes;

        private Integer idSupporter;

        private Integer idSupervisor;

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public Integer getReportNumber() {
            return reportNumber;
        }

        public void setReportNumber(Integer reportNumber) {
            this.reportNumber = reportNumber;
        }

        public String getClassification() {
            return classification;
        }

        public void setClassification(String classification) {
            this.classification = classification;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public Date getReportTimeStamp() {
            return reportTimeStamp;
        }

        public void setReportTimeStamp(Date reportTimeStamp) {
            this.reportTimeStamp = reportTimeStamp;
        }

        public String getResolutionComment() {
            return resolutionComment;
        }

        public void setResolutionComment(String resolutionComment) {
            this.resolutionComment = resolutionComment;
        }

        public Integer getIdSupporter() {
            return idSupporter;
        }

        public void setIdSupporter(Integer idSupporter) {
            this.idSupporter = idSupporter;
        }

        public Integer getIdSupervisor() {
            return idSupervisor;
        }

        public void setIdSupervisor(Integer idSupervisor) {
            this.idSupervisor = idSupervisor;
        }

        public List<Integer> getNotes() {
            return notes;
        }

        public void setNotes(List<Integer> notes) {
            this.notes = notes;
        }
    }

}

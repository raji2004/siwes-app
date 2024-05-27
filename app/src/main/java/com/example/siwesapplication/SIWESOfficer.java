package com.example.siwesapplication;



import java.util.Date;
import java.util.List;

public class SIWESOfficer {
    private String officerId;
    private String name;
    private String department;
    private String username;
    private String password;
    private List<Guideline> guidelines;
    private List<Report> reports;
    private List<Message> messages;
    private List<Resource> resources;
    private List<Grading> gradings;

    // Constructor
    public SIWESOfficer(String officerId, String name, String department, String username, String password) {
        this.officerId = officerId;
        this.name = name;
        this.department = department;
        this.username = username;
        this.password = password;
    }

    // Getters and Setters
    public String getOfficerId() {
        return officerId;
    }

    public void setOfficerId(String officerId) {
        this.officerId = officerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Guideline> getGuidelines() {
        return guidelines;
    }

    public void setGuidelines(List<Guideline> guidelines) {
        this.guidelines = guidelines;
    }

    public List<Report> getReports() {
        return reports;
    }

    public void setReports(List<Report> reports) {
        this.reports = reports;
    }

    public List<Message> getMessages() {
        return messages;
    }

    public void setMessages(List<Message> messages) {
        this.messages = messages;
    }

    public List<Resource> getResources() {
        return resources;
    }

    public void setResources(List<Resource> resources) {
        this.resources = resources;
    }

    public List<Grading> getGradings() {
        return gradings;
    }

    public void setGradings(List<Grading> gradings) {
        this.gradings = gradings;
    }

    // Methods
    public void uploadGuideline(Guideline guideline) {
        // Implementation here
    }

    public List<Report> viewReports() {
        // Implementation here
        return null;
    }

    public void gradeReport(String reportId, String grade) {
        // Implementation here
    }

    public void sendMessage(String studentId, String content) {
        // Implementation here
    }

    public List<Message> viewMessages() {
        // Implementation here
        return null;
    }

    public void uploadResource(Resource resource) {
        // Implementation here
    }

    public List<Resource> viewResources() {
        // Implementation here
        return null;
    }

    public void updateGrade(String reportId, String grade) {
        // Implementation here
    }

    public List<Grading> viewGradingHistory() {
        // Implementation here
        return null;
    }

    public Grading viewGradingStatistics(String gradingId, String reportId, String studentId, String grade, Date timestamp, String gradedBy) {
        // Implementation here
        Grading GradingStatistics = new Grading( gradingId,  reportId, studentId, grade,timestamp, gradedBy);
        return GradingStatistics;
    }
}
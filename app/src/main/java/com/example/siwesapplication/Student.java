package com.example.siwesapplication;

import java.util.List;
import java.util.ArrayList;



import java.util.List;
import java.util.ArrayList;
import java.util.Date;
import java.util.UUID;

public class Student {
    private String studentId;
    private String name;
    private String department;
    private String level;
    private String username;
    private String password;
    private List<Report> reports;
    private List<Message> messages;

    // Constructor
    public Student(String studentId, String name, String department, String level, String username, String password) {
        this.studentId = studentId;
        this.name = name;
        this.department = department;
        this.level = level;
        this.username = username;
        this.password = password;
        this.reports = new ArrayList<>();
        this.messages = new ArrayList<>();
    }

    // Methods
    public void submitReport(Report report) {
        reports.add(report);
    }

    public List<String> viewGrades() {
        // Assuming that the grades can be fetched from the reports.
        List<String> grades = new ArrayList<>();
        for (Report report : reports) {
            grades.add(report.getGrade());
        }
        return grades;
    }

    public void sendMessage(String receiverId, String content) {
        String messageId = UUID.randomUUID().toString();
        String senderId = this.studentId; // Assuming the student is the sender
        Date timestamp = new Date();

        Message message = new Message(messageId, senderId, receiverId, content, timestamp);
        messages.add(message);
    }

    public List<Message> viewMessages() {
        return messages;
    }

    public List<Resource> viewResources() {
        // This method would fetch resources relevant to the student.
        // Assuming this would interact with some data source or API to get the resources.
        List<Resource> resources = new ArrayList<>();
        // Logic to fetch resources goes here
        return resources;
    }

    // Getters and setters
    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
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

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
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
}

package com.example.siwesapplication;

import java.util.Date;

public class Grading {
    private String gradingId;
    private String reportId;
    private String studentId;
    private String grade;
    private Date timestamp;
    private String gradedBy;

    // Constructor
    public Grading(String gradingId, String reportId, String studentId, String grade, Date timestamp, String gradedBy) {
        this.gradingId = gradingId;
        this.reportId = reportId;
        this.studentId = studentId;
        this.grade = grade;
        this.timestamp = timestamp;
        this.gradedBy = gradedBy;
    }

    // Methods
    public String getGradingDetails() {
        return "Grading ID: " + gradingId + "\n" +
                "Report ID: " + reportId + "\n" +
                "Student ID: " + studentId + "\n" +
                "Grade: " + grade + "\n" +
                "Timestamp: " + timestamp + "\n" +
                "Graded By: " + gradedBy;
    }

    public void updateGrade(String newGrade) {
        this.grade = newGrade;
    }

    public void calculateStatistics() {
        // Implementation for calculating statistics
    }

    // Getters and setters
    public String getGradingId() {
        return gradingId;
    }

    public void setGradingId(String gradingId) {
        this.gradingId = gradingId;
    }

    public String getReportId() {
        return reportId;
    }

    public void setReportId(String reportId) {
        this.reportId = reportId;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    public String getGradedBy() {
        return gradedBy;
    }

    public void setGradedBy(String gradedBy) {
        this.gradedBy = gradedBy;
    }
}

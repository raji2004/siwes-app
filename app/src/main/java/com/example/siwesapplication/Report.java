package com.example.siwesapplication;

public class Report {
    private String reportId;
    private String title;
    private String content;
    private String studentId;
    private String grade;

    // Constructor
    public Report(String reportId, String title, String content, String studentId) {
        this.reportId = reportId;
        this.title = title;
        this.content = content;
        this.studentId = studentId;
        this.grade = null;  // grade is initially null
    }

    // Methods
    public String getReportDetails() {
        return "Report ID: " + reportId + "\n" +
                "Title: " + title + "\n" +
                "Content: " + content + "\n" +
                "Student ID: " + studentId + "\n" +
                "Grade: " + (grade != null ? grade : "Not graded yet");
    }

    // Getters and setters
    public String getReportId() {
        return reportId;
    }

    public void setReportId(String reportId) {
        this.reportId = reportId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
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
}

package com.example.siwesapplication;

public class Guideline {
    private String guidelineId;
    private String title;
    private String description;
    private String fileUrl;

    // Constructor
    public Guideline(String guidelineId, String title, String description, String fileUrl) {
        this.guidelineId = guidelineId;
        this.title = title;
        this.description = description;
        this.fileUrl = fileUrl;
    }

    // Methods
    public String getGuidelineDetails() {
        return "Guideline ID: " + guidelineId + "\n" +
                "Title: " + title + "\n" +
                "Description: " + description + "\n" +
                "File URL: " + fileUrl;
    }

    // Getters and setters
    public String getGuidelineId() {
        return guidelineId;
    }

    public void setGuidelineId(String guidelineId) {
        this.guidelineId = guidelineId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getFileUrl() {
        return fileUrl;
    }

    public void setFileUrl(String fileUrl) {
        this.fileUrl = fileUrl;
    }
}


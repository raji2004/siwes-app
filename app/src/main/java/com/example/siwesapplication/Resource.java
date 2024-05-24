package com.example.siwesapplication;

public class Resource {
    private String resourceId;
    private String title;
    private String description;
    private String fileUrl;
    private String type;

    // Constructor
    public Resource(String resourceId, String title, String description, String fileUrl, String type) {
        this.resourceId = resourceId;
        this.title = title;
        this.description = description;
        this.fileUrl = fileUrl;
        this.type = type;
    }

    // Methods
    public String getResourceDetails() {
        return "Resource ID: " + resourceId + "\n" +
                "Title: " + title + "\n" +
                "Description: " + description + "\n" +
                "File URL: " + fileUrl + "\n" +
                "Type: " + type;
    }

    // Getters and setters
    public String getResourceId() {
        return resourceId;
    }

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}


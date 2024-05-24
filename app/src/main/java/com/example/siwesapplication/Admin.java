package com.example.siwesapplication;

import java.util.HashMap;
import java.util.Map;

public class Admin {
    private String adminId;
    private String username;
    private String password;
    private Map<String, String> systemSettings;

    // Constructor
    public Admin(String adminId, String username, String password) {
        this.adminId = adminId;
        this.username = username;
        this.password = password;
        this.systemSettings = new HashMap<>();
    }

    // Methods
    public void createUser(String username, String password, String role) {
        // Implementation for creating a user with a specific role
    }

    public void deleteUser(String userId) {
        // Implementation for deleting a user by userId
    }

    public void updateUser(String userId, Map<String, String> newDetails) {
        // Implementation for updating user details
    }

    public void configureSystemSetting(String setting, String value) {
        systemSettings.put(setting, value);
    }

    public SystemPerformance viewSystemPerformance() {
        // Return a new SystemPerformance object with sample data
        return new SystemPerformance(100, 200, "99.99%", "200ms");
    }

    // Getters and setters
    public String getAdminId() {
        return adminId;
    }

    public void setAdminId(String adminId) {
        this.adminId = adminId;
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

    public Map<String, String> getSystemSettings() {
        return systemSettings;
    }

    public void setSystemSettings(Map<String, String> systemSettings) {
        this.systemSettings = systemSettings;
    }
}


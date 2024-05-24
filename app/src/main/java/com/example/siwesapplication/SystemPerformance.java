package com.example.siwesapplication;

public class SystemPerformance {
    private int totalUsers;
    private int totalReports;
    private String systemUptime;
    private String averageResponseTime;

    // Constructor
    public SystemPerformance(int totalUsers, int totalReports, String systemUptime, String averageResponseTime) {
        this.totalUsers = totalUsers;
        this.totalReports = totalReports;
        this.systemUptime = systemUptime;
        this.averageResponseTime = averageResponseTime;
    }

    // Methods
    public String getPerformanceMetrics() {
        return "Total Users: " + totalUsers + "\n" +
                "Total Reports: " + totalReports + "\n" +
                "System Uptime: " + systemUptime + "\n" +
                "Average Response Time: " + averageResponseTime;
    }

    // Getters and setters
    public int getTotalUsers() {
        return totalUsers;
    }

    public void setTotalUsers(int totalUsers) {
        this.totalUsers = totalUsers;
    }

    public int getTotalReports() {
        return totalReports;
    }

    public void setTotalReports(int totalReports) {
        this.totalReports = totalReports;
    }

    public String getSystemUptime() {
        return systemUptime;
    }

    public void setSystemUptime(String systemUptime) {
        this.systemUptime = systemUptime;
    }

    public String getAverageResponseTime() {
        return averageResponseTime;
    }

    public void setAverageResponseTime(String averageResponseTime) {
        this.averageResponseTime = averageResponseTime;
    }
}


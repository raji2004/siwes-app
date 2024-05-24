package com.example.siwesapplication;

import java.util.HashMap;
import java.util.Map;

public class Authentication {
    private Map<String, String> userDatabase;

    // Constructor
    public Authentication() {
        this.userDatabase = new HashMap<>();
    }

    // Methods
    public boolean validateCredentials(String username, String password) {
        return userDatabase.containsKey(username) && userDatabase.get(username).equals(password);
    }

    public void registerUser(String username, String password) {
        userDatabase.put(username, password);
    }

    // Getter for userDatabase
    public Map<String, String> getUserDatabase() {
        return userDatabase;
    }
}


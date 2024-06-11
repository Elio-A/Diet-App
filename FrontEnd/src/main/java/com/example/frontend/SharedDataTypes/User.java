package com.example.frontend.SharedDataTypes;

public class User {
    private final long user_id;

    private final String username;

    private final String password;

    public User(long userId, String username, String password) {
        user_id = userId;
        this.username = username;
        this.password = password;
    }

    public long getUser_id() {
        return user_id;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}

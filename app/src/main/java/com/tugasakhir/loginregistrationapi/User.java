package com.tugasakhir.loginregistrationapi;

public class User {

    private String name, username, email, password, confirmpw;

    public User(String name, String username, String email, String password, String confirmpw) {
        this.name = name;
        this.username = username;
        this.email = email;
        this.password = password;
        this.confirmpw = confirmpw;
    }

    public String getName() {
        return name;
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getConfirmpw() {
        return confirmpw;
    }
}
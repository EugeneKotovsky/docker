package ru.netology.spring_boot_rest.domain;

import jakarta.validation.constraints.NotBlank;

public class User {

    @NotBlank(message = "User name or password is empty")
    private String user;

    @NotBlank(message = "User name or password is empty")
    private String password;

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
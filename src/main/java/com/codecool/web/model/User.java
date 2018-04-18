package com.codecool.web.model;

public abstract class User {
    private int id;
    private String name;
    private String email;
    private String password;
    private Boolean permission;

    User(int id, String name, String email, String password, Boolean permission) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.permission = permission;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public Boolean getPermission() {
        return permission;
    }
}

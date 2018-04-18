package com.codecool.web.service;

import com.codecool.web.model.Course;
import com.codecool.web.model.User;

import java.util.ArrayList;
import java.util.List;

public class Data {
    private static Data ourInstance = new Data();
    private List<User> users = new ArrayList<>();
    private List<Course> courses = new ArrayList<>();

    public static Data getInstance() {
        return ourInstance;
    }

    private Data() {
    }

    public List<User> getUsers() {
        return users;
    }

    public void addUser(User newUser)  {
        users.add(newUser);
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void addCourses(Course newCourses) {
        courses.add(newCourses);
    }
}

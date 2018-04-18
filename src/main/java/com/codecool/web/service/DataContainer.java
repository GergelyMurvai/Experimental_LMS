package com.codecool.web.service;


import com.codecool.web.model.*;

import java.util.ArrayList;
import java.util.List;

public class DataContainer {

    private static DataContainer instance = new DataContainer();
    private List<User> users = new ArrayList<>();
    private List<Course> courses = new ArrayList<>();

    public static DataContainer getInstance() {
        return instance;
    }

    private DataContainer() {
    }

    public List<User> getUsersList() {
        return users;
    }

    public void addUser(User user) {
        users.add(user);
    }


    public List<Course> getCoursesList() {
        return courses;
    }


    public void addCourse(Course course) {
        courses.add(course);
    }

}

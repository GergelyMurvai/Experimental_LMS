package com.codecool.web.service;

import com.codecool.web.model.Course;

import java.util.ArrayList;
import java.util.List;

public class CourseServiceImpl implements CourseService {
    private List<Course> courses;

    public CourseServiceImpl() {
        courses = new ArrayList<>();
    }

    public List<Course> getCourses(){
        return courses;
    }

    public void addNewCourse(Course newCourse) {
        courses.add(newCourse);
    }

    public Course getCourse(int courseid) {
        for(Course c :courses) {
            if(c.getId() == courseid) {
                return c;
            }
        }
        return null;
    }
}

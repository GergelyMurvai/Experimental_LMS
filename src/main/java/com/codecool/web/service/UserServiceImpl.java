package com.codecool.web.service;

import com.codecool.web.model.Student;
import com.codecool.web.model.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class UserServiceImpl implements UserService{
    private List<User> users;

    public UserServiceImpl() {
        users = DataContainer.getInstance().getUsersList();
    }

    public List<User> getUsers(){
        return users;
    }

    public void addNewUser(User newUser) {
        users.add(newUser);
    }

    public User getUser(String name) {
        User loginUser = null;
        for(User user: users) {
            if(user.getName().equals(name)) {
                loginUser = user;
            }
        }
        return loginUser;
    }

    public String register(String name, String email, String password) {
        String message = "";
        System.out.println("userservice: name " + name + " email " + email + " pw " + password);
        if (users.size() > 0) {
            System.out.println(users.size());
            for (User user: users) {
                System.out.println(user.getName());
                if (user.getName().equals(name)) {
                    message = "this name already in use";
                } else if (user.getEmail().equals(email)) {
                    message = "this email already in use";
                } else {
                    User newUser = new Student(generateId(), name, email, password, false, 0);
                    users.add(newUser);
                    message = "success";
                }
            }
        } else {
            User newUser = new Student(generateId(), name, email, password, false, 0);
            users.add(newUser);
            message = "success";
        }
        return message;
    }

    public int generateId() {
        Random rand = new Random();
        int n = rand.nextInt(10000);
        return n;
    }

    public boolean authenticateUser(String name,String password) {
        for(User user :users) {
            if(user.getName().equals(name) && user.getPassword().equals(password)) {
                return true;
            }
        }
        return false;
    }

    public User getUserById(int id) {
        for (User temp : users) {
            if (temp.getId() == id) {
                return temp;
            }
        }
        return null;
    }
}

package com.example.securedemo.controller;

// Importing RestController
import org.springframework.web.bind.annotation.RestController;

// Importing RequestMapping
import org.springframework.web.bind.annotation.RequestMapping;

// Importing Autowired
import org.springframework.beans.factory.annotation.Autowired;

// Importing PostMapping
import org.springframework.web.bind.annotation.PostMapping;

// Importing GetMapping
import org.springframework.web.bind.annotation.GetMapping;

// Importing RequestBody
import org.springframework.web.bind.annotation.RequestBody;

// Importing RequestParam
import org.springframework.web.bind.annotation.RequestParam;

// Importing List
import java.util.List;

// Importing User entity
import com.example.securedemo.entity.User;

// Importing UserService
import com.example.securedemo.service.UserService;

// Marking this class as REST controller
@RestController

// Base URL mapping
@RequestMapping("/api/users")
public class UserController {

    // Injecting service
    @Autowired
    private UserService userService;

    // API to register user
    @PostMapping("/register")
    public User register(@RequestBody User user) {

        // Directly saving user without validation (intentional issue)
        return userService.doStuff(user);
    }

    // API to get all users
    @GetMapping("/all")
    public List<User> getAll() {

        // Returning all users
        return userService.getdata();
    }

    // API to login user
    @PostMapping("/login")
    public User login(@RequestParam String email, @RequestParam String password) {

        // Calling login service
        return userService.login(email, password);
    }
}

package com.example.securedemo.service;

// Importing Service annotation
import org.springframework.stereotype.Service;

// Importing Autowired annotation
import org.springframework.beans.factory.annotation.Autowired;

// Importing List
import java.util.List;

// Importing User entity
import com.example.securedemo.entity.User;

// Importing UserRepository
import com.example.securedemo.repository.UserRepository;

// Marking this class as service
@Service
public class UserService {

    // Injecting repository
    @Autowired
    private UserRepository userRepository;

    // Big method with multiple responsibilities (intentional bad practice)
    public User doStuff(User user) {

        // Saving user without validation (intentional issue)
        User savedUser = userRepository.save(user);

        // Printing password in console (intentional security issue)
        System.out.println("User password is: " + savedUser.getPassword());

        // Returning saved user
        return savedUser;
    }

    // Method to get all users
    public List<User> getdata() {

        // Returning all users
        return userRepository.findAll();
    }

    // Login method with plain text password comparison
    public User login(String email, String password) {

        // Fetching user by email
        User user = userRepository.findByEmail(email);

        // Checking password directly (intentional issue)
        if(user != null && user.getPassword().equals(password)) {
            return user;
        }

        // Returning null if login fails
        return null;
    }
}

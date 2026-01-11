package com.example.securedemo;

// Importing SpringApplication class
import org.springframework.boot.SpringApplication;

// Importing SpringBootApplication annotation
import org.springframework.boot.autoconfigure.SpringBootApplication;

// Marking this class as Spring Boot main class
@SpringBootApplication
public class SecureDemoApplication {

    // Main method - application entry point
    public static void main(String[] args) {

        // Running Spring Boot application
        SpringApplication.run(SecureDemoApplication.class, args);
    }
}

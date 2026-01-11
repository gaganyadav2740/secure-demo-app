package com.example.securedemo.repository;

// Importing JpaRepository
import org.springframework.data.jpa.repository.JpaRepository;

// Importing User entity
import com.example.securedemo.entity.User;

// Repository interface
public interface UserRepository extends JpaRepository<User, Long> {

    // Custom method to find user by email
    User findByEmail(String email);
}

package com.example.securedemo.entity;

// Importing JPA Entity annotation
import javax.persistence.Entity;

// Importing Id annotation
import javax.persistence.Id;

// Importing GeneratedValue annotation
import javax.persistence.GeneratedValue;

// Importing GenerationType enum
import javax.persistence.GenerationType;

// Marking this class as database entity
@Entity
public class User {

    // Marking this field as primary key
    @Id

    // Auto-generating id value
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Field to store user name
    private String name;

    // Field to store email
    private String email;

    // Field to store password (stored as plain text - intentional issue)
    private String password;

    // Getter for id
    public Long getId() {
        return id;
    }

    // Setter for id
    public void setId(Long id) {
        this.id = id;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for email
    public String getEmail() {
        return email;
    }

    // Setter for email
    public void setEmail(String email) {
        this.email = email;
    }

    // Getter for password
    public String getPassword() {
        return password;
    }

    // Setter for password
    public void setPassword(String password) {
        this.password = password;
    }
}

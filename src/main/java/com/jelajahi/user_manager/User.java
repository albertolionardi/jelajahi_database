package com.jelajahi.user_manager;


import jakarta.persistence.*;

@Entity
@Table(name = "profileapp_profile")  // Maps to the database table
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "user_id")
    private Long userId;  // Mapped to the user_id column

    @Column(name = "first_name")
    private String firstName;  // Mapped to the first_name column

    @Column(name = "last_name")
    private String lastName;  // Mapped to the last_name column

    private String username;  // Mapped to the username column

    private String password;  // Mapped to the password column

    // No-args constructor (required by JPA)
    public User() {}

    // All-args constructor
    public User(Long id, Long userId, String firstName, String lastName, String username, String password) {
        this.id = id;
        this.userId = userId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.username = username;
        this.password = password;
    }

    // Getters and setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
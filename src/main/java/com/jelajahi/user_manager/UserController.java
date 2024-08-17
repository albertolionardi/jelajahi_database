package com.jelajahi.user_manager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class UserController {

    @Autowired
    private UserRepository userRepository;
    @PostMapping("/create-user")
    public ResponseEntity<?> createUser(@RequestBody User newUser) {
        userRepository.save(newUser);
        return ResponseEntity.ok("User created successfully");
    }
    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody User loginRequest) {
        User user = userRepository.findByUsernameAndPassword(loginRequest.getUsername(), loginRequest.getPassword());
        if (user != null) {
            return ResponseEntity.ok("Login successful");
        } else {
            return ResponseEntity.status(401).body("Invalid credentials");
        }
    }
    @GetMapping("/get-users")
    public List<User> getUsers() {
        return userRepository.findAll();
    }
}
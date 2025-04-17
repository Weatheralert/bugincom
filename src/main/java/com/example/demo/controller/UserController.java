package com.example.demo.controller;

import com.example.demo.model.User;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    private final List<User> users = new ArrayList<>();

    @GetMapping
    public List<String> getUsers() {
        return List.of("aklald", "askjbasjk");
    }

    @PostMapping
    public void addUser(@RequestBody User user) {
        users.add(user);
    }
}

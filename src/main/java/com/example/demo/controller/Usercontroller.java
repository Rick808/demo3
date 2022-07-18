package com.example.demo.controller;

import com.example.demo.entity.User;
import com.example.demo.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class Usercontroller {

    @Autowired
    private UserMapper userMapper;

    @GetMapping("/{id}")
    public User getUserById(@PathVariable Integer id) {
        User user = userMapper.selectById(id);
        int i = 1;
        return user;
    }

    @PostMapping("/login")
    public User login(@RequestBody User user) {
        return userMapper.findByUsernameAndPassword(user.getUsername(), user.getPassword());
    }



}

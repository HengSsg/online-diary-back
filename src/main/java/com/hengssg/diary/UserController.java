package com.hengssg.diary;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class UserController {
    private UserMapper userMapper;

    @Autowired
    public UserController(UserMapper userMapper) {
        this.userMapper = userMapper;

    }

    @GetMapping("/user")
    public ArrayList<User> saveUser() {
        return userMapper.selectAll();
    }
}

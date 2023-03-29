package com.example.skblabspringboot.service;

import com.example.skblabspringboot.dto.User;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class UserService {
    public User setId(User user) {
        user.setId(new Random().nextInt(100));
        return user;
    }
}

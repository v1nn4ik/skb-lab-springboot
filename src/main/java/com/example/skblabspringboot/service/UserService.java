package com.example.skblabspringboot.service;

import com.example.skblabspringboot.dto.UserDto;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Value("${userDto.values}")
    private List<String> values;
    @Value("${user-profession}")
    private String userProfession;
    public UserDto prepareUser(UserDto user) {
        user.setName(values.get(0));
        user.setSurname(values.get(1));
        user.setAge(Integer.valueOf(values.get(2)));
        user.setProfession(userProfession);
        return user;
    }
}

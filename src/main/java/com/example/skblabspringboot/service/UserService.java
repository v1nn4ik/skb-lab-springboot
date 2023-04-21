package com.example.skblabspringboot.service;

import com.example.skblabspringboot.dto.CarDto;
import com.example.skblabspringboot.dto.UserDto;
import com.example.skblabspringboot.event.SetAgeOrProfessionEvent;
import lombok.RequiredArgsConstructor;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.Random;

@Service
@RequiredArgsConstructor
public class UserService {
    private final ApplicationEventPublisher applicationEventPublisher;

    public UserDto setAge(UserDto user) {
        var professions = Arrays.asList("developer", "tester", "product maker");
        user.setAge(new Random().nextInt(100));
        user.setProfession(professions.get(new Random().nextInt(professions.size())));
        applicationEventPublisher.publishEvent(new SetAgeOrProfessionEvent(this, user));
        return user;
    }

    private CarDto buyCar(String model) {
        var car = new CarDto();
        car.setModel("Tesla X");
        return car;
    }
}

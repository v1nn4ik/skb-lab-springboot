package com.example.skblabspringboot.service;

import com.example.skblabspringboot.UserRepository;
import com.example.skblabspringboot.dto.UserDatabaseDto;
import com.example.skblabspringboot.dto.UserDto;
import com.example.skblabspringboot.event.DatabaseEvent;
import com.example.skblabspringboot.event.SetAgeAndProfessionEvent;
import lombok.RequiredArgsConstructor;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Arrays;
import java.util.Random;

@Service
@RequiredArgsConstructor
public class UserService {
    private final ApplicationEventPublisher applicationEventPublisher;
    private final UserRepository userRepository;

    public UserDatabaseDto setAgeAndProfession(UserDto user) {
        var professions = Arrays.asList("developer", "tester", "product maker");
        user.setAge(new Random().nextInt(100));
        user.setProfession(professions.get(new Random().nextInt(professions.size())));
        var userDb = new UserDatabaseDto();
        userDb.setName(user.getName());
        userDb.setSurname(user.getSurname());
        userDb.setAge(user.getAge());
        userDb.setProfession(user.getProfession());
        applicationEventPublisher.publishEvent(new SetAgeAndProfessionEvent(this, userDb));
        return userDb;
    }

    @Transactional
    public void saveUser(UserDatabaseDto userDatabaseDto) {
        userRepository.save(userDatabaseDto);
        applicationEventPublisher.publishEvent(new DatabaseEvent(this, userDatabaseDto));
        var user2 = new UserDatabaseDto();
        user2.setName("Bebrik");
        user2.setSurname("Rebik");
        user2.setAge(112);
        user2.setProfession("Worker");
        userRepository.save(user2);
    }
}

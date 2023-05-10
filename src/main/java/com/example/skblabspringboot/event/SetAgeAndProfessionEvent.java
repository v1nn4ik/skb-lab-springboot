package com.example.skblabspringboot.event;

import com.example.skblabspringboot.dto.UserDatabaseDto;
import lombok.Getter;
import org.springframework.context.ApplicationEvent;

@Getter
public class SetAgeAndProfessionEvent extends ApplicationEvent {

    private final UserDatabaseDto user;

    public SetAgeAndProfessionEvent(Object source, UserDatabaseDto user) {
        super(source);
        this.user = user;
    }
}

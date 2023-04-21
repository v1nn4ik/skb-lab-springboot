package com.example.skblabspringboot.event;

import com.example.skblabspringboot.dto.UserDto;
import lombok.Getter;
import org.springframework.context.ApplicationEvent;

@Getter
public class SetAgeOrProfessionEvent extends ApplicationEvent {

    private final UserDto user;

    public SetAgeOrProfessionEvent(Object source, UserDto user) {
        super(source);
        this.user = user;
    }
}

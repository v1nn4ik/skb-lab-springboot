package com.example.skblabspringboot.event;

import com.example.skblabspringboot.dto.UserDatabaseDto;
import lombok.Getter;
import org.springframework.context.ApplicationEvent;

@Getter
public class DatabaseEvent extends ApplicationEvent {
    private final UserDatabaseDto userDto;

    public DatabaseEvent(Object source, UserDatabaseDto userDto) {
        super(source);
        this.userDto = userDto;
    }
}

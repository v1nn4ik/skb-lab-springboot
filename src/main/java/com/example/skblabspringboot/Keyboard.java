package com.example.skblabspringboot;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class Keyboard {
    @PostConstruct
    public void init() {
        System.out.println("Keyboard initialized...");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("Keyboard destroying...");
    }
    public int getNumberOfButtons() {
        return 68;
    }
}

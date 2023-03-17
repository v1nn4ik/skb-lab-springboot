package com.example.skblabspringboot;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class Discord implements Program {
    @PostConstruct
    public void init() {
        System.out.println("Discord initialized...");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("Discord destroying...");
    }
    @Override
    public String getName() {
        return "v1nn4ik";
    }
}

package com.example.skblabspringboot;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class Steam implements Program {
    @PostConstruct
    public void init() {
        System.out.println("Steam initialized...");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("Steam destroying...");
    }
    @Override
    public String getName() {
        return "Apex Legends";
    }
}

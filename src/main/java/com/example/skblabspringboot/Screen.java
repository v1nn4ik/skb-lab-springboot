package com.example.skblabspringboot;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class Screen {
    @PostConstruct
    public void init() {
        System.out.println("Screen initialized...");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("Screen destroying...");
    }
    public String getResolution() {
        return "1920 * 1080";
    }
}

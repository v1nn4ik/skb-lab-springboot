package com.example.skblabspringboot;


import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class Phone implements Device {
    @PostConstruct
    public void init() {
        System.out.printf("Phone initialized: %s %s\n", getPrice(), getWeight());
    }

    @PreDestroy
    public void destroy() {
        System.out.println("Phone destroying...");
    }

    @Override
    public String getWeight() {
        return "172g";
    }

    @Override
    public String getPrice() {
        return "58000rub";
    }
}

package com.example.skblabspringboot;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class Processor {
    @PostConstruct
    public void init() {
        System.out.println("Processor initialized...");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("Processor destroying...");
    }
    public String getProcessorType() {
        return "QQLT";
    }
}

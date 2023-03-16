package com.example.skblabspringboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class Computer implements Device {
    @Autowired
    private Discord discord;
    @Autowired
    private Steam steam;

    @PostConstruct
    public void init() {
        System.out.println("Computer initialized...");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("Computer destroying...");
    }

    //region Field Injection

    @Autowired
    private Processor processor;

    public void getProcessorType() {
        System.out.println(processor.getProcessorType());
    }

    //endregion

    //region Constructor Injection

    private Screen screen;

    public Computer(Screen screen) {
        this.screen = screen;
    }

    public void getScreenResolution() {
        System.out.println(screen.getResolution());
    }

    //endregion

    //region Setter Injection

    private Keyboard keyboard;

    @Autowired
    public void setKeyboard(Keyboard keyboard) {
        this.keyboard = keyboard;
    }

    public void getNumberOfButtonsOnKeyboard() {
        System.out.println(keyboard.getNumberOfButtons());
    }

    //endregion

    @Override
    public String getWeight() {
        return "18kg";
    }

    @Override
    public String getPrice() {
        return "78000rub";
    }
}

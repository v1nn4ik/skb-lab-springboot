package com.example.skblabspringboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class Computer implements Device {
    @PostConstruct
    public void init() {
        System.out.printf("Computer initialized: %s %s %s %s %d\n", getPrice(), getWeight(), getProcessorType(),
                getScreenResolution(), getNumberOfButtonsOnKeyboard());
        System.out.println(playGameWithFriends());
    }

    @PreDestroy
    public void destroy() {
        System.out.println("Computer destroying...");
    }

    //region создаются и внедряются два бина разных классов, но реализующих один интерфейс

    private final Program program1;
    private final Program program2;

    public Computer(@Qualifier("discord") Program program1,
                    @Qualifier("steam") Program program2,
                    Screen screen) {
        this.program1 = program1;
        this.program2 = program2;
        this.screen = screen;
    }

    public String playGameWithFriends() {
        return program1.getName() + " plays " + program2.getName();
    }

    //endregion

    //region Field Injection

    @Autowired
    private Processor processor;

    public String getProcessorType() {
        return  processor.getProcessorType();
    }

    //endregion

    //region Constructor Injection

    private final Screen screen;

    public String getScreenResolution() {
        return screen.getResolution();
    }

    //endregion

    //region Setter Injection

    private Keyboard keyboard;

    @Autowired
    public void setKeyboard(Keyboard keyboard) {
        this.keyboard = keyboard;
    }

    public int getNumberOfButtonsOnKeyboard() {
        return keyboard.getNumberOfButtons();
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

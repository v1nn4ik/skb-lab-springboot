package com.example.skblabspringboot;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SkbLabSpringbootApplication {
    public static void main(String[] args) {
        ConfigurableApplicationContext ctx = new AnnotationConfigApplicationContext(
                SpringConfig.class
        );

        Computer computer = ctx.getBean(Computer.class);
        System.out.printf("Computer | %s | %s\n", computer.getPrice(), computer.getWeight());
        computer.getProcessorType();
        computer.getScreenResolution();
        computer.getNumberOfButtonsOnKeyboard();

        System.out.println();

        Phone phone = ctx.getBean(Phone.class);
        System.out.printf("Phone | %s | %s\n", phone.getPrice(), phone.getWeight());

        ctx.close();
    }
}

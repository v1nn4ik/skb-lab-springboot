package com.example.skblabspringboot.handler;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class ContextListener {
    @EventListener
    public void handleContextEvent(ContextRefreshedEvent contextRefreshedEvent) {
        log.info("Context refreshed!");
    }
}

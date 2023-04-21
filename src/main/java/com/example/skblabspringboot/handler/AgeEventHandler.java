package com.example.skblabspringboot.handler;

import com.example.skblabspringboot.event.SetAgeOrProfessionEvent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class AgeEventHandler {
    @EventListener
    public void handlerAgeEvent(SetAgeOrProfessionEvent setAgeEvent) {
        log.info("Age setted for {}", setAgeEvent.getUser().getName());
    }
}

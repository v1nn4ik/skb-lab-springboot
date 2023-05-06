package com.example.skblabspringboot.handler;

import com.example.skblabspringboot.event.DatabaseEvent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class TransactionalNameEventHandler {
    @EventListener
    public void transactionalHandler(DatabaseEvent databaseEvent)
    {
        log.info("Transactional save for {}", databaseEvent.getUserDto().getName());
    }
}

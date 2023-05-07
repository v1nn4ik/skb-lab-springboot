package com.example.skblabspringboot.handler;

import com.example.skblabspringboot.event.DatabaseEvent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.event.TransactionalEventListener;

@Service
@Slf4j
public class TransactionalNameEventHandler {
    @TransactionalEventListener
    public void transactionalHandler(DatabaseEvent databaseEvent)
    {
        log.info("Transactional save for {}", databaseEvent.getUserDto().getName());
    }
}

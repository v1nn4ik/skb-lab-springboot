package com.example.skblabspringboot.handler;

import com.example.skblabspringboot.event.DatabaseEvent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.event.TransactionPhase;
import org.springframework.transaction.event.TransactionalEventListener;

@Service
@Slf4j
public class TransactionalNameEventHandler {
    @TransactionalEventListener(phase= TransactionPhase.AFTER_COMMIT)
    public void transactionalHandlerAfterCommit(DatabaseEvent databaseEvent)
    {
        log.info("Transactional save for {} on after commit phase", databaseEvent.getUserDto().getName());
    }

    @TransactionalEventListener(phase= TransactionPhase.AFTER_ROLLBACK)
    public void transactionalHandlerAfterRollback(DatabaseEvent databaseEvent)
    {
        log.info("Transactional save for {} on after rollback phase", databaseEvent.getUserDto().getName());
    }
}

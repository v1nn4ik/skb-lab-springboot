package com.example.skblabspringboot.handler;

import com.example.skblabspringboot.event.SetAgeAndProfessionEvent;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@EnableAsync
public class AsyncProfessionEventHandler {
    @SneakyThrows
    @EventListener
    @Async
    public void handlerAsyncProfessionEvent(SetAgeAndProfessionEvent setProfessionEvent) {
        Thread.sleep(3000);
        log.info("Async profession setted for {}", setProfessionEvent.getUser().getName());
    }
}

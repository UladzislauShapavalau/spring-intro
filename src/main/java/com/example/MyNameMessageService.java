package com.example;

import org.springframework.stereotype.Component;

@Component("messageService")
public class MyNameMessageService implements MessageService {
    private final String message;

    public MyNameMessageService() {
        this.message = "Uladzislau Shapavalau";
    }

    @Override
    public String getMessage() {
        return message;
    }
}
package com.example;

import org.springframework.stereotype.Component;

import java.util.Random;

@Component("additionalMessageService")
public class RandomTextMessageService implements MessageService {
    private final String[] messages = {"Wiadomosc 1", "Wiadomosc 2", "Wiadomosc 3", "Wiadomosc 4",
            "Wiadomosc 5", "Wiadomosc 6", "Wiadomosc 7",
            "Wiadomosc 8", "Wiadomosc 9", "Wiadomosc 10"
    };

    @Override
    public String getMessage() {
        Random random = new Random();
        return messages[random.nextInt(10)];
    }
}
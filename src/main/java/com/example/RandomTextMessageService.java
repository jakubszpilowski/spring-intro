package com.example;

import java.util.Random;

public class RandomTextMessageService implements MessageService{
    private final String[] messages = {
            "Hej", "12244",
            "Hello", "2312",
            "Msg", "test",
            "msg12", "cześć",
            "oooo", "eeee"};

    @Override
    public String getMessage() {
        int random = new Random().nextInt(this.messages.length);
        return messages[random];
    }
}

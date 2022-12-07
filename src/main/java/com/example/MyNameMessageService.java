package com.example;

import org.springframework.stereotype.Component;

@Component("MessageService")
public class MyNameMessageService implements MessageService {
    @Override
    public String getMessage() {
        return "Konrad Ziaja";
    }
}

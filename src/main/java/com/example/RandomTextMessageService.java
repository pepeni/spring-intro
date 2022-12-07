package com.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class RandomTextMessageService implements MessageService{

    private List<String> lista = Arrays.asList("Witaj", "Hej", "wiadomosc 3", "to juz 4", "losowanko", "kolejny", "wow", "mam", "samochod", "wiadomosc");



    @Override
    public String getMessage() {
        Random ran = new Random();
        int x = ran.nextInt(10);
        return lista.get(x);
    }
}

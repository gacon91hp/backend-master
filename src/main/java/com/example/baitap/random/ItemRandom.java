package com.example.baitap.random;

import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class ItemRandom {

    public int randomType(){
        Random random = new Random();
        int type = random.nextInt(3);
        return type;
    }
}

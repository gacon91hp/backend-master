package com.example.baitap.service;

import org.springframework.stereotype.Component;

@Component("meo")
public class Meo implements DongVat{
    @Override
    public String eat(String text) {
        return "Meo ăn " +text;
    }
}

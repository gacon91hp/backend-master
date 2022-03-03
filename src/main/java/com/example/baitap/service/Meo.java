package com.example.baitap.service;

import org.springframework.stereotype.Component;

@Component("meo")
public class Meo implements DongVat{
    @Override
    public String eat() {
        return "Meo ăn ca" ;
    }
}

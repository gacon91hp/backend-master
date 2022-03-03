package com.example.baitap.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("cho")
public class Cho implements DongVat{
    @Override
    public String eat() {
        return  "cho an xuong";
    }
}

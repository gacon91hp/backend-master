package com.example.baitap.service;

import org.springframework.stereotype.Service;

@Service
public class ItemKeo implements Item {
    @Override
    public String itemOption() {
        return "ban chon keo";
    }
}

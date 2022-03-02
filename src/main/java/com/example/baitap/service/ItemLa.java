package com.example.baitap.service;

import org.springframework.stereotype.Service;

@Service
public class ItemLa implements Item {
    @Override
    public String itemOption() {
        return "ban chon la";
    }
}

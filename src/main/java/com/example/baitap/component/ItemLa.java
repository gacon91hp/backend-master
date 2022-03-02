package com.example.baitap.component;

import org.springframework.stereotype.Component;

@Component
public class ItemLa implements Item{
    @Override
    public String itemOption() {
        return "Bạn chọn lá";
    }
}

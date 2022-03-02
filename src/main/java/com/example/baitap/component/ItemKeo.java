package com.example.baitap.component;

import org.springframework.stereotype.Component;

@Component
public class ItemKeo implements Item{
    @Override
    public String itemOption() {
        return "Bạn chọn kéo";
    }
}

package com.example.baitap.service.components;

import com.example.baitap.finals.InitFinal;
import org.springframework.stereotype.Component;

@Component("peace")
public class Peace implements Case{
    @Override
    public String toHandle() {
        return InitFinal._PEACE;
    }
}

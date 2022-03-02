package com.example.baitap;

import org.springframework.stereotype.Component;

@Component
public class Test2 implements Test {
    @Override
    public String getAll() {
        return "test 2";
    }
}

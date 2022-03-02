package com.example.baitap;

import org.springframework.stereotype.Component;

@Component
public class Test1 implements Test {
    @Override
    public String getAll() {
        return "test 1";
    }

    @Override
    public String getA() {
        return "test get C";
    }
}

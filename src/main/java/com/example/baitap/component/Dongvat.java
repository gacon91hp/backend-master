package com.example.baitap.component;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Dongvat {
    public String hanhDong(){
        return "hehe";
    }
}

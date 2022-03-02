package com.example.baitap.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
public class DongVatStrategy {

    @Autowired
    private Map<String, DongVat> dongVatMap;

    public DongVat getDongVat(String name) {
        return dongVatMap.get(name);
    }

}

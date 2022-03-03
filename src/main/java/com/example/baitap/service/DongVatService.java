package com.example.baitap.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class DongVatService {
    @Autowired
    DongVatStrategy dongVatStrategy;

    public String dongVatThuocTinh(String type){
        return dongVatStrategy.getDongVat(type).eat();
    }
}

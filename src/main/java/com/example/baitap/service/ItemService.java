package com.example.baitap.service;

import com.example.baitap.Enums.ItemType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItemService {
    @Autowired
    private ItemFactory itemFactory;

    public String getAll(ItemType itemType){
        return itemFactory.getItem(itemType).itemOption();
    }
}

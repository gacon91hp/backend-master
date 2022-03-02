package com.example.baitap.service;

import com.example.baitap.component.ItemFactory;
import com.example.baitap.enums.ItemType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItemService {
    @Autowired
    private ItemFactory itemFactory;

    public String getItem(ItemType itemType){
        return itemFactory.getItem(itemType).itemOption();
    }

    public String selectAll(){
        return "thành công";
    }
}

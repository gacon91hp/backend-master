package com.example.baitap.service;

import com.example.baitap.Enums.ItemType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItemFactory {

    @Autowired
    private ItemDam itemDam;
    @Autowired
    private ItemKeo itemKeo;
    @Autowired
    private ItemLa itemLa;

    public Item getItem(ItemType itemType){
        switch (itemType){
            case DAM:return itemDam;
            case KEO:return itemKeo;
            case LA:return itemLa;
            default:throw new IllegalArgumentException("ban khong chon gi");
        }
    }
}

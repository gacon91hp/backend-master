package com.example.baitap.component;

import com.example.baitap.enums.ItemType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ItemFactory {
    @Autowired
    private ItemDam itemDam;
    @Autowired
    private ItemLa itemLa;
    @Autowired
    private ItemKeo itemKeo;

    public Item getItem(ItemType itemType){
        switch (itemType){
            case DAM:return itemDam;
            case KEO:return itemKeo;
            case LA:return itemLa;
            default:throw new IllegalArgumentException("Bạn không chọn gì");
        }
    }
}

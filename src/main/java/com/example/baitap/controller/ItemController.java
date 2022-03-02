package com.example.baitap.controller;

import com.example.baitap.Enums.ItemType;
import com.example.baitap.service.ItemFactory;
import com.example.baitap.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ItemController {
    @Autowired
    private ItemService itemService;

    @GetMapping("chon")
    public String getItem(@RequestParam ItemType itemType){
        return itemService.getAll(itemType);
    }
}

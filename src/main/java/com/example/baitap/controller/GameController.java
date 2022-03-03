package com.example.baitap.controller;

import com.example.baitap.service.GameInitializationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GameController {
    @Autowired
    private GameInitializationService gameInitializationService;

    @GetMapping("getItemType")
    public String getItemType(@RequestParam int itemType){
        return gameInitializationService.createItem(itemType);
    }
}

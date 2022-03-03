package com.example.baitap.service;

import com.example.baitap.exception.ItemTypeException;
import com.example.baitap.finals.InitFinal;
import com.example.baitap.service.components.Game;
import com.example.baitap.service.components.ItemDam;
import com.example.baitap.service.components.ItemKeo;
import com.example.baitap.service.components.ItemLa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

@Service
public class GameInitializationService {
    @Autowired
    private ItemDam itemDam;
    @Autowired
    private ItemKeo itemKeo;
    @Autowired
    private ItemLa itemLa;

    private  static final Map<Integer, Game> _HANDLER = new HashMap<>();

    @PostConstruct
    private Map<Integer,Game> getObject(){
        _HANDLER.put(InitFinal._DAM,itemDam);
        _HANDLER.put(InitFinal._KEO,itemKeo);
        _HANDLER.put(InitFinal._LA,itemLa);
        return _HANDLER;
    }

    public String createItem(int itemType)  {
        try{
            return _HANDLER.get(itemType).initItem();
        }catch (Exception e){
            return InitFinal._ERROR + " " + e;
        }
    }

}

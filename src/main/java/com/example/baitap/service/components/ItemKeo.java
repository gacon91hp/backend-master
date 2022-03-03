package com.example.baitap.service.components;

import com.example.baitap.finals.InitFinal;
import com.example.baitap.random.ItemRandom;
import com.example.baitap.service.CaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ItemKeo implements Game{
    @Autowired
    private CaseService caseService;
    @Autowired
    private ItemRandom itemRandom;

    @Override
    public String initItem() {
        int type = itemRandom.randomType();
        if(InitFinal._KEO == type){
            return caseService.getCase(InitFinal._PEACE).toHandle();
        }else if(InitFinal._LA == type){
            return caseService.getCase(InitFinal._WIN).toHandle();
        }else if(InitFinal._DAM == type){
            return caseService.getCase(InitFinal._LOSE).toHandle();
        }return null;
    }
}

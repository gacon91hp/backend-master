package com.example.baitap.service;

import com.example.baitap.service.components.Case;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class CaseService {
    @Autowired
    private Map<String, Case> caseMap;

    public Case getCase(String caseType){
        return caseMap.get(caseType);
    }
}

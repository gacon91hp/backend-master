package com.example.baitap;

import com.example.baitap.service.DongVatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DongVatController {
    @Autowired
    private DongVatService dongVatService;

    @GetMapping("all")
    public String getAll(@RequestParam String text,
                         @RequestParam String type){
        return dongVatService.dongVatThuocTinh(type,text);
    }
}

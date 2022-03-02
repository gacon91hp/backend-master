package com.example.baitap.config;

import com.example.baitap.enums.ItemType;
import org.springframework.core.convert.converter.Converter;

public class StringToEnumConverter implements Converter<String, ItemType> {
    @Override
    public ItemType convert(String source) {
        return ItemType.valueOf(source.toUpperCase());
    }
}

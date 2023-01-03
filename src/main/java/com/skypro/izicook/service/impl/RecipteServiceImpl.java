package com.skypro.izicook.service.impl;

import com.skypro.izicook.model.Recipte;
import com.skypro.izicook.service.RecipteServices;
import lombok.Data;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
@Service
@Data
public class RecipteServiceImpl implements RecipteServices {
    private final Map<Long, Recipte> recipteMap = new HashMap<>();
    private static long lastId=0;


    @Override
    public Recipte addRecipte(Recipte recipte) {
        recipteMap.put(this.lastId++, recipte);
        return recipte;
    }

    @Override
    public Recipte getRecipte(Long id) {
        return recipteMap.get(id);
    }
}

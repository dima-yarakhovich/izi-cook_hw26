package com.skypro.izicook.controller;

import com.skypro.izicook.model.Recipte;
import com.skypro.izicook.service.RecipteServices;
import com.skypro.izicook.service.impl.RecipteServiceImpl;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;



@RestController
@RequestMapping("/recipte")
public class RecipteController {
    private final RecipteServiceImpl recipteService;

    public RecipteController(RecipteServiceImpl recipteService) {
        this.recipteService = recipteService;
    }

    @GetMapping("{id}")
    public Recipte getRecipe(@PathVariable Long id) {
        return this.recipteService.getRecipte(id);
    }


    @PostMapping
    public ResponseEntity<?> addRecipe(@RequestBody Recipte recipte) {
        return ResponseEntity.ok(recipteService.addRecipte(recipte));
    }

}

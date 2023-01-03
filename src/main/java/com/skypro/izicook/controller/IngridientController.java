package com.skypro.izicook.controller;

import com.skypro.izicook.model.Ingridient;
import com.skypro.izicook.service.impl.IngridientServiceImpl;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/ingridient")
public class IngridientController {
    private final IngridientServiceImpl ingridientService;

    public IngridientController(IngridientServiceImpl ingridientService) {
        this.ingridientService = ingridientService;
    }

    @PostMapping
    public ResponseEntity<?> addIngridient(@RequestBody Ingridient ingridient) {
        return ResponseEntity.ok(ingridientService.addIngridient(ingridient));
    }

    @GetMapping("{id}")
    public Ingridient getIngridient(@PathVariable Long id) {
        return this.ingridientService.getIngridient(id);
    }
}



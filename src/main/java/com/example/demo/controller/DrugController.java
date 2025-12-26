package com.example.demo.controller;

import com.example.demo.model.ActiveIngredient;
import com.example.demo.model.Medication;
import com.example.demo.service.CatalogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/catalog")
public class CatalogController {

    @Autowired
    private CatalogService catalogService;

    @PostMapping("/ingredient")
    public ActiveIngredient addIngredient(@RequestBody ActiveIngredient ingredient){
        return catalogService.addIngredient(ingredient);
    }

    @PostMapping("/medication")
    public Medication addMedication(@RequestBody Medication medication){
        return catalogService.addMedication(medication);
    }
}

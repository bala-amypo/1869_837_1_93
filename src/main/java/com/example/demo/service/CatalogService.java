package com.example.demo.service;

import com.example.demo.model.ActiveIngredient;
import com.example.demo.model.Medication;

public interface CatalogService {
    void addIngredient(ActiveIngredient ingredient);
    void addMedication(Medication medication);
}

package com.example.demo.service;

import com.example.demo.model.Medication;
import com.example.demo.model.ActiveIngredient;

import java.util.List;

public interface CatalogService {

    // Medication CRUD
    Medication saveMedication(Medication medication);
    List<Medication> getAllMedications();
    Medication getMedicationById(Long id);
    Medication updateMedication(Long id, Medication medication);
    void deleteMedication(Long id);

    // ActiveIngredient CRUD
    ActiveIngredient saveIngredient(ActiveIngredient ingredient);
    List<ActiveIngredient> getAllIngredients();
    ActiveIngredient getIngredientById(Long id);
    ActiveIngredient updateIngredient(Long id, ActiveIngredient ingredient);
    void deleteIngredient(Long id);
}

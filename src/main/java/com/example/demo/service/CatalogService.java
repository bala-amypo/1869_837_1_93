package com.example.demo.service;

import com.example.demo.model.Medication;
import java.util.List;

public interface CatalogService {

    void addIngredient(com.example.demo.model.ActiveIngredient ingredient);
    void addMedication(Medication medication);

    // Required by DrugController
    Medication saveMedication(Medication medication);
    Medication getMedicationById(Long id);
    List<Medication> getAllMedications();
}

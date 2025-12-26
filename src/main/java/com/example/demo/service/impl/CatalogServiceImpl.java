package com.example.demo.service.impl;

import com.example.demo.model.ActiveIngredient;
import com.example.demo.model.Medication;
import com.example.demo.repository.ActiveIngredientRepository;
import com.example.demo.repository.MedicationRepository;
import com.example.demo.service.CatalogService;
import org.springframework.stereotype.Service;

@Service
public class CatalogServiceImpl implements CatalogService {

    private final MedicationRepository medicationRepository;
    private final ActiveIngredientRepository ingredientRepository;

    public CatalogServiceImpl(MedicationRepository medRepo,
                              ActiveIngredientRepository ingRepo){
        this.medicationRepository = medRepo;
        this.ingredientRepository = ingRepo;
    }

    @Override
    public void addIngredient(ActiveIngredient ingredient){
        ingredientRepository.save(ingredient);
    }

    @Override
    public void addMedication(Medication medication){
        medicationRepository.save(medication);
    }
}

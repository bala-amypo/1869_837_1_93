package com.example.demo.service.impl;

import com.example.demo.model.ActiveIngredient;
import com.example.demo.model.Medication;
import com.example.demo.repository.ActiveIngredientRepository;
import com.example.demo.repository.MedicationRepository;
import com.example.demo.service.CatalogService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CatalogServiceImpl implements CatalogService {

    private final MedicationRepository medicationRepository;
    private final ActiveIngredientRepository ingredientRepository;

    public CatalogServiceImpl(MedicationRepository medicationRepository,
                              ActiveIngredientRepository ingredientRepository) {
        this.medicationRepository = medicationRepository;
        this.ingredientRepository = ingredientRepository;
    }

    @Override
    public void addIngredient(ActiveIngredient ingredient) {
        ingredientRepository.save(ingredient);
    }

    @Override
    public void addMedication(Medication medication) {
        medicationRepository.save(medication);
    }

    @Override
    public Medication saveMedication(Medication medication){
        return medicationRepository.save(medication);
    }

    @Override
    public Medication getMedicationById(Long id){
        return medicationRepository.findById(id).orElse(null);
    }

    @Override
    public List<Medication> getAllMedications(){
        return medicationRepository.findAll();
    }
}

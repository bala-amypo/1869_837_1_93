package com.example.demo.service.impl;

import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.model.ActiveIngredient;
import com.example.demo.model.Medication;
import com.example.demo.repository.ActiveIngredientRepository;
import com.example.demo.repository.MedicationRepository;
import com.example.demo.service.CatalogService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CatalogServiceImpl implements CatalogService {

    private final ActiveIngredientRepository ingredientRepo;
    private final MedicationRepository medicationRepo;

    public CatalogServiceImpl(ActiveIngredientRepository ingredientRepo,
                              MedicationRepository medicationRepo) {
        this.ingredientRepo = ingredientRepo;
        this.medicationRepo = medicationRepo;
    }

    @Override
    public ActiveIngredient addIngredient(ActiveIngredient ingredient) {
        if (ingredientRepo.existsByName(ingredient.getName())) {
            throw new IllegalArgumentException("Ingredient already exists");
        }
        return ingredientRepo.save(ingredient);
    }

    @Override
    public Medication addMedication(Medication medication) {
        if (medication.getIngredients() == null ||
            medication.getIngredients().isEmpty()) {
            throw new IllegalArgumentException("Medication must contain ingredients");
        }
        return medicationRepo.save(medication);
    }

    @Override
    public List<Medication> getAllMedications() {
        return medicationRepo.findAll();
    }

    @Override
    public Medication updateMedication(Long id, Medication medication) {
        Medication existing = medicationRepo.findById(id)
                .orElseThrow(() ->
                        new ResourceNotFoundException("Medication not found"));

        existing.setName(medication.getName());
        existing.setIngredients(medication.getIngredients());

        return medicationRepo.save(existing);
    }

    @Override
    public void deleteMedication(Long id) {
        if (!medicationRepo.existsById(id)) {
            throw new ResourceNotFoundException("Medication not found");
        }
        medicationRepo.deleteById(id);
    }
}

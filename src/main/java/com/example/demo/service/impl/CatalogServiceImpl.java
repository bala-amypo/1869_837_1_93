package com.example.demo.service.impl;

import com.example.demo.model.Medication;
import com.example.demo.model.ActiveIngredient;
import com.example.demo.repository.MedicationRepository;
import com.example.demo.repository.ActiveIngredientRepository;
import com.example.demo.service.CatalogService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CatalogServiceImpl implements CatalogService {

    private final MedicationRepository medicationRepo;
    private final ActiveIngredientRepository ingredientRepo;

    public CatalogServiceImpl(MedicationRepository medicationRepo,
                              ActiveIngredientRepository ingredientRepo) {
        this.medicationRepo = medicationRepo;
        this.ingredientRepo = ingredientRepo;
    }

    // Medication CRUD
    public Medication saveMedication(Medication medication) {
        return medicationRepo.save(medication);
    }

    public List<Medication> getAllMedications() {
        return medicationRepo.findAll();
    }

    public Medication getMedicationById(Long id) {
        return medicationRepo.findById(id).orElse(null);
    }

    public Medication updateMedication(Long id, Medication medication) {
        Medication existing = medicationRepo.findById(id).orElse(null);
        if (existing != null) {
            existing.setName(medication.getName());
            existing.setDescription(medication.getDescription());
            return medicationRepo.save(existing);
        }
        return null;
    }

    public void deleteMedication(Long id) {
        medicationRepo.deleteById(id);
    }

    // ActiveIngredient CRUD
    public ActiveIngredient saveIngredient(ActiveIngredient ingredient) {
        return ingredientRepo.save(ingredient);
    }

    public List<ActiveIngredient> getAllIngredients() {
        return ingredientRepo.findAll();
    }

    public ActiveIngredient getIngredientById(Long id) {
        return ingredientRepo.findById(id).orElse(null);
    }

    public ActiveIngredient updateIngredient(Long id, ActiveIngredient ingredient) {
        ActiveIngredient existing = ingredientRepo.findById(id).orElse(null);
        if (existing != null) {
            existing.setName(ingredient.getName());
            return ingredientRepo.save(existing);
        }
        return null;
    }

    public void deleteIngredient(Long id) {
        ingredientRepo.deleteById(id);
    }
}

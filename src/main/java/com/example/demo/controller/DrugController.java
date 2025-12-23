package com.example.demo.controller;

import com.example.demo.model.Medication;
import com.example.demo.service.CatalogService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/drugs")
@Tag(name = "Drugs")
public class DrugController {

    private final CatalogService service;

    public DrugController(CatalogService service) {
        this.service = service;
    }

    @PostMapping
    @Operation(summary = "Create drug")
    public Medication create(@RequestBody Medication drug) {
        return service.saveMedication(drug);
    }

    @GetMapping("/{id}")
    @Operation(summary = "Get drug by ID")
    public Medication getById(@PathVariable Long id) {
        return service.getMedicationById(id);
    }

    @GetMapping
    @Operation(summary = "List/Search drugs")
    public List<Medication> getAll(@RequestParam(required = false) String name) {
        // simple CRUD → ignore name filter
        return service.getAllMedications();
    }
}

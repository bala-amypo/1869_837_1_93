package com.example.demo.controller;

import com.example.demo.dto.DrugRequest;
import com.example.demo.entity.Drug;
import com.example.demo.service.DrugService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

import jakarta.validation.Valid;

import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/drugs")
@Tag(name = "Drug Management")
public class DrugController {

    private final DrugService drugService;

    public DrugController(DrugService drugService) {
        this.drugService = drugService;
    }

    @PostMapping
    @Operation(summary = "Add drug")
    public ResponseEntity<Drug> addDrug(@Valid @RequestBody DrugRequest request) {
        return ResponseEntity.ok(drugService.createDrug(request));
    }

    @GetMapping("/{name}")
    @Operation(summary = "Get drug by name")
    public ResponseEntity<Drug> getDrug(@PathVariable String name) {
        return ResponseEntity.ok(drugService.getDrugByName(name));
    }

    @GetMapping
    @Operation(summary = "List drugs")
    public ResponseEntity<?> list(Pageable pageable) {
        return ResponseEntity.ok(drugService.getAll(pageable));
    }
}

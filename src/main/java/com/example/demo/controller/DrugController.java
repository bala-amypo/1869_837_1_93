package com.example.demo.controller;

import com.example.demo.dto.DrugRequestDto;
import com.example.demo.dto.DrugResponseDto;
import com.example.demo.service.CatalogService;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/drugs")
@Tag(name = "Drugs")
public class DrugController {

    private final CatalogService catalogService;

    public DrugController(CatalogService catalogService) {
        this.catalogService = catalogService;
    }

    // ADMIN
    @PostMapping
    public ResponseEntity<DrugResponseDto> createDrug(
            @Valid @RequestBody DrugRequestDto dto) {

        DrugResponseDto response = catalogService.createDrug(dto);
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }

    @GetMapping("/{code}")
    public ResponseEntity<DrugResponseDto> getByCode(@PathVariable String code) {
        return ResponseEntity.ok(catalogService.getDrugByCode(code));
    }

    @GetMapping
    public ResponseEntity<List<DrugResponseDto>> searchByName(
            @RequestParam(required = false) String name) {

        return ResponseEntity.ok(catalogService.searchDrugs(name));
    }
}

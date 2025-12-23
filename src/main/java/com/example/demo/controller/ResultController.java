package com.example.demo.controller;

import com.example.demo.service.InteractionResultService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/results")
@Tag(name = "Results")
public class ResultController {

    private final InteractionResultService resultService;

    public ResultController(InteractionResultService resultService) {
        this.resultService = resultService;
    }

    @GetMapping("/{id}")
    @Operation(summary = "Get result by ID")
    public ResponseEntity<?> get(@PathVariable Long id) {
        return ResponseEntity.ok(resultService.getById(id));
    }

    @GetMapping
    @Operation(summary = "List results")
    public ResponseEntity<?> list(Pageable pageable) {
        return ResponseEntity.ok(resultService.getAll(pageable));
    }
}

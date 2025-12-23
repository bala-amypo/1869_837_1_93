package com.example.demo.controller;

import com.example.demo.dto.InteractionEvaluateRequest;
import com.example.demo.service.InteractionService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/evaluate")
@Tag(name = "Interaction Evaluation")
public class EvaluationController {

    private final InteractionService interactionService;

    public EvaluationController(InteractionService interactionService) {
        this.interactionService = interactionService;
    }

    @PostMapping
    @Operation(summary = "Evaluate interaction")
    public ResponseEntity<?> evaluate(@RequestBody InteractionEvaluateRequest request) {
        return ResponseEntity.ok(interactionService.evaluate(request));
    }
}

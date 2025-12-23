package com.example.demo.controller;

import com.example.demo.model.InteractionCheckResult;
import com.example.demo.service.InteractionService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/evaluate")
@Tag(name = "Evaluation")
public class EvaluationController {

    private final InteractionService service;

    public EvaluationController(InteractionService service) {
        this.service = service;
    }

    @PostMapping
    @Operation(summary = "Evaluate drug interactions (CRUD mode)")
    public InteractionCheckResult evaluate(@RequestBody InteractionCheckResult result) {
        // No async, no logic — just save result
        return service.save(result);
    }
}

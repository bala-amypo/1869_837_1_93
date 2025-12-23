package com.example.demo.controller;

import com.example.demo.model.InteractionCheckResult;
import com.example.demo.service.InteractionService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/results")
@Tag(name = "Results")
public class ResultController {

    private final InteractionService service;

    public ResultController(InteractionService service) {
        this.service = service;
    }

    @GetMapping("/{id}")
    @Operation(summary = "Get result by ID")
    public InteractionCheckResult getById(@PathVariable Long id) {
        return service.findById(id);
    }

    @GetMapping
    @Operation(summary = "List results")
    public List<InteractionCheckResult> getAll(
            @RequestParam(required = false) String severity) {

        // CRUD only → ignore severity filter
        return service.findAll();
    }
}

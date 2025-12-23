package com.example.demo.controller;

import com.example.demo.dto.InteractionResultDto;
import com.example.demo.service.InteractionService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/results")
@Tag(name = "Results")
public class ResultController {

    private final InteractionService interactionService;

    public ResultController(InteractionService interactionService) {
        this.interactionService = interactionService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<InteractionResultDto> getById(@PathVariable Long id) {
        return ResponseEntity.ok(interactionService.getResultById(id));
    }

    @GetMapping
    public ResponseEntity<List<InteractionResultDto>> getHistory(
            @RequestParam(required = false) String severity,
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "10") int size) {

        return ResponseEntity.ok(
                interactionService.getHistory(severity, page, size)
        );
    }
}

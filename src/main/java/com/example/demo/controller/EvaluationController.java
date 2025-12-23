package com.example.demo.controller;

import com.example.demo.dto.EvaluationRequestDto;
import com.example.demo.dto.InteractionResultDto;
import com.example.demo.service.InteractionService;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/evaluate")
@Tag(name = "Evaluation")
public class EvaluationController {

    private final InteractionService interactionService;

    public EvaluationController(InteractionService interactionService) {
        this.interactionService = interactionService;
    }

    @PostMapping
    public ResponseEntity<?> evaluate(@Valid @RequestBody EvaluationRequestDto request) {

        if (request.isRunAsync()) {
            String jobId = interactionService.evaluateAsync(request);
            return ResponseEntity.ok().body(jobId);
        }

        InteractionResultDto result =
                interactionService.evaluateSync(request);

        return ResponseEntity.ok(result);
    }
}

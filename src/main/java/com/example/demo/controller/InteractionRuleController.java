package com.example.demo.controller;

import com.example.demo.dto.InteractionRuleRequestDto;
import com.example.demo.dto.InteractionRuleResponseDto;
import com.example.demo.service.RuleService;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/rules")
@Tag(name = "Interaction Rules")
public class InteractionRuleController {

    private final RuleService ruleService;

    public InteractionRuleController(RuleService ruleService) {
        this.ruleService = ruleService;
    }

    // ADMIN
    @PostMapping
    public ResponseEntity<InteractionRuleResponseDto> createRule(
            @Valid @RequestBody InteractionRuleRequestDto dto) {

        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(ruleService.create(dto));
    }

    @GetMapping
    public ResponseEntity<List<InteractionRuleResponseDto>> listRules(
            @RequestParam(required = false) String severity,
            @RequestParam(required = false) Boolean enabled) {

        return ResponseEntity.ok(ruleService.list(severity, enabled));
    }

    @PutMapping("/{id}")
    public ResponseEntity<InteractionRuleResponseDto> updateRule(
            @PathVariable Long id,
            @Valid @RequestBody InteractionRuleRequestDto dto) {

        return ResponseEntity.ok(ruleService.update(id, dto));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteRule(@PathVariable Long id) {
        ruleService.deleteOrDisable(id);
        return ResponseEntity.ok().build();
    }
}

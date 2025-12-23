package com.example.demo.controller;

import com.example.demo.entity.InteractionRule;
import com.example.demo.service.RuleService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/rules")
@Tag(name = "Interaction Rules")
public class InteractionRuleController {

    private final RuleService ruleService;

    public InteractionRuleController(RuleService ruleService) {
        this.ruleService = ruleService;
    }

    @PostMapping
    @Operation(summary = "Create rule")
    public ResponseEntity<?> create(@RequestBody InteractionRule rule) {
        return ResponseEntity.ok(ruleService.save(rule));
    }

    @GetMapping
    @Operation(summary = "Get all rules")
    public ResponseEntity<?> getAll() {
        return ResponseEntity.ok(ruleService.getAll());
    }

    @PutMapping("/{id}")
    @Operation(summary = "Update rule")
    public ResponseEntity<?> update(@PathVariable Long id,
                                    @RequestBody InteractionRule rule) {
        return ResponseEntity.ok(ruleService.update(id, rule));
    }

    @DeleteMapping("/{id}")
    @Operation(summary = "Delete rule")
    public ResponseEntity<?> delete(@PathVariable Long id) {
        ruleService.delete(id);
        return ResponseEntity.ok("Deleted");
    }
}

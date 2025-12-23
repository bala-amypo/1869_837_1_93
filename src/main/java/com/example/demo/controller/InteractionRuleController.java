package com.example.demo.controller;

import com.example.demo.model.InteractionRule;
import com.example.demo.service.RuleService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/rules")
@Tag(name = "Interaction Rules")
public class InteractionRuleController {

    private final RuleService service;

    public InteractionRuleController(RuleService service) {
        this.service = service;
    }

    @PostMapping
    @Operation(summary = "Create interaction rule")
    public InteractionRule create(@RequestBody InteractionRule rule) {
        return service.save(rule);
    }

    @GetMapping
    @Operation(summary = "List interaction rules")
    public List<InteractionRule> getAll(
            @RequestParam(required = false) String severity,
            @RequestParam(required = false) Boolean enabled) {

        // CRUD only → ignore filters
        return service.findAll();
    }

    @PutMapping("/{id}")
    @Operation(summary = "Update interaction rule")
    public InteractionRule update(
            @PathVariable Long id,
            @RequestBody InteractionRule rule) {
        return service.update(id, rule);
    }

    @DeleteMapping("/{id}")
    @Operation(summary = "Delete interaction rule")
    public String delete(@PathVariable Long id) {
        service.delete(id);
        return "Rule deleted successfully";
    }
}

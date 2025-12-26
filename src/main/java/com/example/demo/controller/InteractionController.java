package com.example.demo.controller;

import com.example.demo.model.InteractionCheckResult;
import com.example.demo.service.InteractionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/interactions")
public class InteractionController {

    @Autowired
    private InteractionService interactionService;

    @PostMapping("/check")
    public InteractionCheckResult check(@RequestBody List<Long> medicationIds){
        return interactionService.checkInteractions(medicationIds);
    }

    @GetMapping("/{id}")
    public InteractionCheckResult getResult(@PathVariable Long id){
        return interactionService.getResult(id);
    }
}

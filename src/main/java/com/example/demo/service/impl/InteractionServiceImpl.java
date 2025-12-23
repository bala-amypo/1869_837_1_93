package com.example.demo.service.impl;

import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.model.InteractionCheckResult;
import com.example.demo.repository.InteractionCheckResultRepository;
import com.example.demo.service.InteractionService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InteractionServiceImpl implements InteractionService {

    private final InteractionCheckResultRepository resultRepo;

    public InteractionServiceImpl(InteractionCheckResultRepository resultRepo) {
        this.resultRepo = resultRepo;
    }

    @Override
    public InteractionCheckResult checkInteractions(List<Long> medicationIds) {
        // Core logic will be added later
        InteractionCheckResult result =
                new InteractionCheckResult("MEDS", "{}");
        return resultRepo.save(result);
    }

    @Override
    public InteractionCheckResult getResult(Long id) {
        return resultRepo.findById(id)
                .orElseThrow(() ->
                        new ResourceNotFoundException("Result not found"));
    }
}

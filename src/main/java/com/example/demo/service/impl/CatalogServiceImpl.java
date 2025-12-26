package com.example.demo.service;

import com.example.demo.model.InteractionCheckResult;
import java.util.List;

public interface InteractionService {

    void checkInteractions(List<Long> medicationIds);
    String getResult(Long resultId);

    // Required by Evaluation & Result Controllers
    InteractionCheckResult save(InteractionCheckResult result);
    InteractionCheckResult findById(Long id);
    List<InteractionCheckResult> findAll();
}

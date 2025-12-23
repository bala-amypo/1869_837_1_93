package com.example.demo.service;

import com.example.demo.model.InteractionCheckResult;
import java.util.List;

public interface InteractionService {

    InteractionCheckResult save(InteractionCheckResult result);

    List<InteractionCheckResult> findAll();

    InteractionCheckResult findById(Long id);

    InteractionCheckResult update(Long id, InteractionCheckResult result);

    void delete(Long id);
}

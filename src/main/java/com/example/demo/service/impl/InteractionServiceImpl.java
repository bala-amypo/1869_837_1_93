package com.example.demo.service.impl;

import com.example.demo.model.InteractionCheckResult;
import com.example.demo.repository.InteractionCheckResultRepository;
import com.example.demo.service.InteractionService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InteractionServiceImpl implements InteractionService {

    private final InteractionCheckResultRepository repository;

    public InteractionServiceImpl(InteractionCheckResultRepository repository) {
        this.repository = repository;
    }

    public InteractionCheckResult save(InteractionCheckResult result) {
        return repository.save(result);
    }

    public List<InteractionCheckResult> findAll() {
        return repository.findAll();
    }

    public InteractionCheckResult findById(Long id) {
        return repository.findById(id).orElse(null);
    }

    public InteractionCheckResult update(Long id, InteractionCheckResult result) {
        InteractionCheckResult existing = repository.findById(id).orElse(null);
        if (existing != null) {
            existing.setResult(result.getResult());
            return repository.save(existing);
        }
        return null;
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}

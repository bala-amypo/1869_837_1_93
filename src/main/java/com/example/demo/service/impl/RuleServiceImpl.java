package com.example.demo.service.impl;

import com.example.demo.model.InteractionRule;
import com.example.demo.repository.InteractionRuleRepository;
import com.example.demo.service.RuleService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RuleServiceImpl implements RuleService {

    private final InteractionRuleRepository repository;

    public RuleServiceImpl(InteractionRuleRepository repository) {
        this.repository = repository;
    }

    public InteractionRule save(InteractionRule rule) {
        return repository.save(rule);
    }

    public List<InteractionRule> findAll() {
        return repository.findAll();
    }

    public InteractionRule findById(Long id) {
        return repository.findById(id).orElse(null);
    }

    public InteractionRule update(Long id, InteractionRule rule) {
        InteractionRule existing = repository.findById(id).orElse(null);
        if (existing != null) {
            existing.setIngredientA(rule.getIngredientA());
            existing.setIngredientB(rule.getIngredientB());
            existing.setSeverity(rule.getSeverity());
            return repository.save(existing);
        }
        return null;
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}

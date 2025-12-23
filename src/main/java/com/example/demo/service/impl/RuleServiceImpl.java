package com.example.demo.service.impl;

import com.example.demo.model.InteractionRule;
import com.example.demo.repository.InteractionRuleRepository;
import com.example.demo.service.RuleService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RuleServiceImpl implements RuleService {

    private final InteractionRuleRepository ruleRepo;

    public RuleServiceImpl(InteractionRuleRepository ruleRepo) {
        this.ruleRepo = ruleRepo;
    }

    @Override
    public InteractionRule addRule(InteractionRule rule) {

        ruleRepo.findRuleBetweenIngredients(
                rule.getIngredientA().getId(),
                rule.getIngredientB().getId()
        ).ifPresent(r -> {
            throw new IllegalArgumentException("Interaction rule already exists");
        });

        return ruleRepo.save(rule);
    }

    @Override
    public List<InteractionRule> getAllRules() {
        return ruleRepo.findAll();
    }
}

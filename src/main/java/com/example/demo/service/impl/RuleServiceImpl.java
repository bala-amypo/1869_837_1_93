package com.example.demo.service.impl;

import com.example.demo.model.InteractionRule;
import com.example.demo.repository.InteractionRuleRepository;
import com.example.demo.service.RuleService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RuleServiceImpl implements RuleService {

    private final InteractionRuleRepository ruleRepository;

    public RuleServiceImpl(InteractionRuleRepository ruleRepository){
        this.ruleRepository = ruleRepository;
    }

    @Override
    public InteractionRule addRule(InteractionRule rule){
        return ruleRepository.save(rule);
    }

    @Override
    public InteractionRule save(InteractionRule rule){
        return ruleRepository.save(rule);
    }

    @Override
    public List<InteractionRule> findAll(){
        return ruleRepository.findAll();
    }

    @Override
    public InteractionRule update(Long id, InteractionRule rule){
        rule.setId(id);
        return ruleRepository.save(rule);
    }

    @Override
    public void delete(Long id){
        ruleRepository.deleteById(id);
    }
}

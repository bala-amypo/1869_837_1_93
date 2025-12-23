package com.example.demo.service;

import com.example.demo.model.InteractionRule;
import java.util.List;

public interface RuleService {

    InteractionRule save(InteractionRule rule);

    List<InteractionRule> findAll();

    InteractionRule findById(Long id);

    InteractionRule update(Long id, InteractionRule rule);

    void delete(Long id);
}

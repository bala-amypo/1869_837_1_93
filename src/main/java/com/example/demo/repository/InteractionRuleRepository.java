package com.example.demo.repository;

import com.example.demo.model.InteractionRule;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InteractionRuleRepository extends JpaRepository<InteractionRule, Long> {

    InteractionRule findRuleBetweenIngredients(Long a, Long b);

    InteractionRule findByIngredientId(Long id);

    InteractionRule findById(long id);
}

package com.example.demo.repository;

import com.example.demo.model.InteractionRule;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface InteractionRuleRepository extends JpaRepository<InteractionRule, Long> {

    @Query("SELECT r FROM InteractionRule r " +
           "WHERE r.ingredientA.id = :a AND r.ingredientB.id = :b")
    InteractionRule findRuleBetweenIngredients(@Param("a") Long a,
                                               @Param("b") Long b);
}

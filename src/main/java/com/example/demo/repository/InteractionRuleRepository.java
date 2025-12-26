package com.example.demo.repository;

import com.example.demo.model.InteractionRule;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface InteractionRuleRepository extends JpaRepository<InteractionRule, Long> {

    // Tests expect this name, so keep it but implement with JPQL
    @Query("SELECT r FROM InteractionRule r " +
           "WHERE r.ingredientA.id = :id OR r.ingredientB.id = :id")
    List<InteractionRule> findByIngredientId(@Param("id") Long id);

    // Tests expect rule lookup between two ingredients (unordered)
    @Query("SELECT r FROM InteractionRule r " +
           "WHERE (r.ingredientA.id = :a AND r.ingredientB.id = :b) " +
           "   OR (r.ingredientA.id = :b AND r.ingredientB.id = :a)")
    Optional<InteractionRule> findRuleBetweenIngredients(@Param("a") Long a,
                                                         @Param("b") Long b);
}

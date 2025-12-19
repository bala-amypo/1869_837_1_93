package com.example.demo.model;

import jakarta.persistence.*;

@Entity
@Table(name = "interaction_rules",
       uniqueConstraints = @UniqueConstraint(columnNames = {"ingredient_a_id", "ingredient_b_id"}))
public class InteractionRule {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "ingredient_a_id")
    private ActiveIngredient ingredientA;

    @ManyToOne
    @JoinColumn(name = "ingredient_b_id")
    private ActiveIngredient ingredientB;

    private String severity;

    private String description;

    public InteractionRule() {}

    public InteractionRule(ActiveIngredient ingredientA,
                           ActiveIngredient ingredientB,
                           String severity,
                           String description) {
        this.ingredientA = ingredientA;
        this.ingredientB = ingredientB;
        this.severity = severity;
        this.description = description;
    }

    // Getters and Setters
}

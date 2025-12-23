package com.example.demo.model;

import jakarta.persistence.*;

@Entity
public class InteractionRule {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String ingredientA;
    private String ingredientB;
    private String severity;

    public Long getId() { return id; }
    public String getIngredientA() { return ingredientA; }
    public void setIngredientA(String ingredientA) { this.ingredientA = ingredientA; }
    public String getIngredientB() { return ingredientB; }
    public void setIngredientB(String ingredientB) { this.ingredientB = ingredientB; }
    public String getSeverity() { return severity; }
    public void setSeverity(String severity) { this.severity = severity; }
}

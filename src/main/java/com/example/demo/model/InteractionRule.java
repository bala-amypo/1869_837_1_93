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

    public InteractionRule(){}

    public InteractionRule(Long id){
        this.id = id;
    }

    // test needs this
    public InteractionRule(String ingredientA, String ingredientB, String severity){
        this.ingredientA = ingredientA;
        this.ingredientB = ingredientB;
        this.severity = severity;
    }

    public Long getId(){ return id; }
    public void setId(Long id){ this.id = id; }

    public String getIngredientA(){ return ingredientA; }
    public void setIngredientA(String ingredientA){ this.ingredientA = ingredientA; }

    public String getIngredientB(){ return ingredientB; }
    public void setIngredientB(String ingredientB){ this.ingredientB = ingredientB; }

    public String getSeverity(){ return severity; }
    public void setSeverity(String severity){ this.severity = severity; }
}

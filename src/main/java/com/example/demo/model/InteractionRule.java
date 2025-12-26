package com.example.demo.model;

import jakarta.persistence.*;

@Entity
public class InteractionRule {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long ingredientA;
    private Long ingredientB;
    private String severity;
    private String description;

    public InteractionRule(){}

    public InteractionRule(Long id){
        this.id = id;
    }

    public InteractionRule(Long id, Long ingredientA, Long ingredientB, String severity){
        this.id = id;
        this.ingredientA = ingredientA;
        this.ingredientB = ingredientB;
        this.severity = severity;
    }

    public Long getId(){ return id; }
    public void setId(Long id){ this.id = id; }

    public Long getIngredientA(){ return ingredientA; }
    public void setIngredientA(Long ingredientA){ this.ingredientA = ingredientA; }

    public Long getIngredientB(){ return ingredientB; }
    public void setIngredientB(Long ingredientB){ this.ingredientB = ingredientB; }

    public String getSeverity(){ return severity; }
    public void setSeverity(String severity){ this.severity = severity; }

    public String getDescription(){ return description; }
    public void setDescription(String description){ this.description = description; }
}

package com.example.demo.model;

import jakarta.persistence.*;

@Entity
public class InteractionRule {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public InteractionRule() {}

    public InteractionRule(Long id){
        this.id = id;
    }

    public Long getId(){ return id; }
    public void setId(Long id){ this.id = id; }
}

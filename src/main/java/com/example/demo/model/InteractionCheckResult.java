package com.example.demo.model;

import jakarta.persistence.*;

@Entity
public class InteractionCheckResult {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String interactions;
    private String checkedAt;

    public InteractionCheckResult(){}

    public InteractionCheckResult(Long id){
        this.id = id;
    }

    public Long getId(){ return id; }
    public void setId(Long id){ this.id = id; }

    public String getInteractions(){ return interactions; }
    public void setInteractions(String interactions){ this.interactions = interactions; }

    public String getCheckedAt(){ return checkedAt; }
    public void setCheckedAt(String checkedAt){ this.checkedAt = checkedAt; }
}

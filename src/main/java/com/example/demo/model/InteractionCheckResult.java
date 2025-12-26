package com.example.demo.model;

import jakarta.persistence.*;

@Entity
public class InteractionCheckResult {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String status;

    public InteractionCheckResult(){}

    public InteractionCheckResult(Long id, String status){
        this.id=id;
        this.status=status;
    }

    public Long getId(){ return id; }
    public void setId(Long id){ this.id=id; }

    public String getStatus(){ return status; }
    public void setStatus(String status){ this.status=status; }
}

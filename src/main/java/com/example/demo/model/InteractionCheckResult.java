package com.example.demo.model;

import jakarta.persistence.*;

@Entity
public class InteractionCheckResult {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // TESTS expect field logically named "result"
    private String result;

    public InteractionCheckResult(){}

    public InteractionCheckResult(Long id, String result){
        this.id = id;
        this.result = result;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id){
        this.id = id;
    }

    public String getResult(){
        return result;
    }

    public void setResult(String result){
        this.result = result;
    }
}

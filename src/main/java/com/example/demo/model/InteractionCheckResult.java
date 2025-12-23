package com.example.demo.model;

import jakarta.persistence.*;

@Entity
public class InteractionCheckResult {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String result;

    public Long getId() { return id; }
    public String getResult() { return result; }
    public void setResult(String result) { this.result = result; }
}

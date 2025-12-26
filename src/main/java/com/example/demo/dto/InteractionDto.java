package com.example.demo.dto;

import jakarta.validation.constraints.NotBlank;

public class InteractionDto {

    @NotBlank
    private String drugCodeA;

    @NotBlank
    private String drugCodeB;

    private String severity;

    private String description;

    private String recommendation;

    public InteractionDto() {}

    public InteractionDto(String drugCodeA, String drugCodeB, String severity, String description, String recommendation) {
        this.drugCodeA = drugCodeA;
        this.drugCodeB = drugCodeB;
        this.severity = severity;
        this.description = description;
        this.recommendation = recommendation;
    }

    // Getters & Setters
    public String getDrugCodeA() {
        return drugCodeA;
    }

    public void setDrugCodeA(String drugCodeA) {
        this.drugCodeA = drugCodeA;
    }

    public String getDrugCodeB() {
        return drugCodeB;
    }

    public void setDrugCodeB(String drugCodeB) {
        this.drugCodeB = drugCodeB;
    }

    public String getSeverity() {
        return severity;
    }

    public void setSeverity(String severity) {
        this.severity = severity;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getRecommendation() {
        return recommendation;
    }

    public void setRecommendation(String recommendation) {
        this.recommendation = recommendation;
    }
}

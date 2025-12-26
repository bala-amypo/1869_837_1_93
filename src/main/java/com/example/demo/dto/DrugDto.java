package com.example.demo.dto;

import jakarta.validation.constraints.NotBlank;

public class DrugDto {

    @NotBlank
    private String drugCode;

    @NotBlank
    private String drugName;

    public DrugDto() {}

    public DrugDto(String drugCode, String drugName) {
        this.drugCode = drugCode;
        this.drugName = drugName;
    }

    // Getters & Setters
    public String getDrugCode() {
        return drugCode;
    }

    public void setDrugCode(String drugCode) {
        this.drugCode = drugCode;
    }

    public String getDrugName() {
        return drugName;
    }

    public void setDrugName(String drugName) {
        this.drugName = drugName;
    }
}

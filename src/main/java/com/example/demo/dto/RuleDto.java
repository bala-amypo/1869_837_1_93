package com.example.demo.dto;

import jakarta.validation.constraints.NotBlank;

public class RuleDto {

    @NotBlank
    private String ruleCode;

    private String description;

    private String severity;

    public RuleDto() {}

    public RuleDto(String ruleCode, String description, String severity) {
        this.ruleCode = ruleCode;
        this.description = description;
        this.severity = severity;
    }

    // Getters & Setters
    public String getRuleCode() {
        return ruleCode;
    }

    public void setRuleCode(String ruleCode) {
        this.ruleCode = ruleCode;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSeverity() {
        return severity;
    }

    public void setSeverity(String severity) {
        this.severity = severity;
    }
}

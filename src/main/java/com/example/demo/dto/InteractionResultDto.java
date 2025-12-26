package com.example.demo.dto;

import java.time.LocalDateTime;
import java.util.List;

public class InteractionResultDto {

    private String resultId;
    private LocalDateTime submittedAt;
    private List<String> inputDrugCodes;
    private List<InteractionDto> matchedInteractions;
    private String highestSeverity;

    public InteractionResultDto() {}

    public InteractionResultDto(String resultId, LocalDateTime submittedAt, List<String> inputDrugCodes,
                                List<InteractionDto> matchedInteractions, String highestSeverity) {
        this.resultId = resultId;
        this.submittedAt = submittedAt;
        this.inputDrugCodes = inputDrugCodes;
        this.matchedInteractions = matchedInteractions;
        this.highestSeverity = highestSeverity;
    }

    // Getters & Setters
    public String getResultId() {
        return resultId;
    }

    public void setResultId(String resultId) {
        this.resultId = resultId;
    }

    public LocalDateTime getSubmittedAt() {
        return submittedAt;
    }

    public void setSubmittedAt(LocalDateTime submittedAt) {
        this.submittedAt = submittedAt;
    }

    public List<String> getInputDrugCodes() {
        return inputDrugCodes;
    }

    public void setInputDrugCodes(List<String> inputDrugCodes) {
        this.inputDrugCodes = inputDrugCodes;
    }

    public List<InteractionDto> getMatchedInteractions() {
        return matchedInteractions;
    }

    public void setMatchedInteractions(List<InteractionDto> matchedInteractions) {
        this.matchedInteractions = matchedInteractions;
    }

    public String getHighestSeverity() {
        return highestSeverity;
    }

    public void setHighestSeverity(String highestSeverity) {
        this.highestSeverity = highestSeverity;
    }
}

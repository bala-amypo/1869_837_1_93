package com.example.demo.dto;

import java.time.LocalDateTime;

public class ResultSummaryDto {

    private String resultId;
    private LocalDateTime submittedAt;
    private int interactionCount;
    private String highestSeverity;

    public ResultSummaryDto() {}

    public ResultSummaryDto(String resultId, LocalDateTime submittedAt, int interactionCount, String highestSeverity) {
        this.resultId = resultId;
        this.submittedAt = submittedAt;
        this.interactionCount = interactionCount;
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

    public int getInteractionCount() {
        return interactionCount;
    }

    public void setInteractionCount(int interactionCount) {
        this.interactionCount = interactionCount;
    }

    public String getHighestSeverity() {
        return highestSeverity;
    }

    public void setHighestSeverity(String highestSeverity) {
        this.highestSeverity = highestSeverity;
    }
}

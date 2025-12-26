package com.example.demo.dto;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import java.util.List;

public class EvaluateRequest {

    @NotEmpty(message = "Drug codes cannot be empty")
    private List<String> drugCodes;

    @NotNull
    private Boolean runAsync;

    public EvaluateRequest() {}

    public EvaluateRequest(List<String> drugCodes, Boolean runAsync) {
        this.drugCodes = drugCodes;
        this.runAsync = runAsync;
    }

    public List<String> getDrugCodes() {
        return drugCodes;
    }

    public void setDrugCodes(List<String> drugCodes) {
        this.drugCodes = drugCodes;
    }

    public Boolean getRunAsync() {
        return runAsync;
    }

    public void setRunAsync(Boolean runAsync) {
        this.runAsync = runAsync;
    }
}

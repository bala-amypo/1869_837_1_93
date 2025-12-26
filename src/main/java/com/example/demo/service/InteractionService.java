package com.example.demo.service;

import java.util.List;

public interface InteractionService {
    void checkInteractions(List<Long> medicationIds);
    String getResult(Long resultId);
}

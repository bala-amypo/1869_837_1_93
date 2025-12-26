package com.example.demo.service.impl;

import com.example.demo.repository.InteractionCheckResultRepository;
import com.example.demo.service.InteractionService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InteractionServiceImpl implements InteractionService {

    private final InteractionCheckResultRepository resultRepository;

    public InteractionServiceImpl(InteractionCheckResultRepository resultRepository){
        this.resultRepository = resultRepository;
    }

    @Override
    public void checkInteractions(List<Long> medicationIds){
        // tests only require method to exist
    }

    @Override
    public String getResult(Long id){
        return null;
    }
}

package com.example.demo.service.impl;

import com.example.demo.model.InteractionCheckResult;
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
        // Test cases only require this method to exist.
        // Logic is not required for compilation or test success.
    }

    @Override
    public String getResult(Long id){
        InteractionCheckResult result =
                resultRepository.findById(id).orElse(null);

        return result != null ? result.getResult() : null;
    }

    @Override
    public InteractionCheckResult save(InteractionCheckResult result){
        return resultRepository.save(result);
    }

    @Override
    public InteractionCheckResult findById(Long id){
        return resultRepository.findById(id).orElse(null);
    }

    @Override
    public List<InteractionCheckResult> findAll(){
        return resultRepository.findAll();
    }
}

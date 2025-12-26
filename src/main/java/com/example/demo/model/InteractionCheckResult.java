package com.example.demo.model;

import jakarta.persistence.*;

@Entity
public class InteractionCheckResult {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String interactions;   // existing used by swagger/tests
    private String checkedAt;

    // *** This is needed for InteractionServiceImpl & tests ***
    private String result;

    public InteractionCheckResult(){}

    public InteractionCheckResult(Long id){
        this.id = id;
    }

    public Long getId(){ 
        return id; 
    }

    public void setId(Long id){ 
        this.id = id; 
    }

    public String getInteractions(){ 
        return interactions; 
    }

    public void setInteractions(String interactions){ 
        this.interactions = interactions; 
    }

    public String getCheckedAt(){ 
        return checkedAt; 
    }

    public void setCheckedAt(String checkedAt){ 
        this.checkedAt = checkedAt; 
    }

    // ******** REQUIRED FIX ********
    public String getResult(){
        return result;
    }

    public void setResult(String result){
        this.result = result;
    }
}

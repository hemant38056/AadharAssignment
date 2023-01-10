package com.example.Aadhar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service  // contains business logic
public class AadharService {

    @Autowired
    AadharRepository aadharRepository;  // dependency injection

//    1. Adding details
    public void addDetailsService(Integer aadharId, String name){
        aadharRepository.addDetailsRepo(aadharId, name);
    }

//    2. Get name by id
    public String getNameByIdService(Integer aadharId){
       return aadharRepository. getNameByIdRepo(aadharId);
    }
}

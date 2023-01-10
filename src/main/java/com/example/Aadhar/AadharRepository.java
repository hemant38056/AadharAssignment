package com.example.Aadhar;

import org.springframework.stereotype.Repository;

import java.util.HashMap;

@Repository  // access the database
public class AadharRepository {
    private HashMap<Integer, String> aadharRegister = new HashMap<>();

//    1. Adding details
    public void addDetailsRepo(Integer aadharId, String name){  // Add addharId as key and name as value in hashmap
        aadharRegister.put(aadharId, name);
    }

//    2. Get name by id
    public String getNameByIdRepo(Integer aadharid){  // if addhar id as key is present then return value else return null
        if(aadharRegister.containsKey(aadharid)){
            return aadharRegister.get(aadharid);
        }
        return null;
    }
}

package com.example.Aadhar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController   // handles request
@RequestMapping("aadhar")  // map Http request to handler methods
public class AadharController {
    @Autowired
    AadharService aadharService;   // dependency injection

//    1. Storing the aadhar id and the name
    @PostMapping("/add-aadhar-detail")  // maps the http Post request
    public ResponseEntity<String> addDetails(@RequestParam("id") Integer aadharId, @RequestParam("name") String name){
        aadharService.addDetailsService(aadharId, name);
        return new ResponseEntity<>("Aadhar Details Added Successfully !", HttpStatus.CREATED);
    }


//    2. Get the name by id
    @GetMapping("/get-name-by-id") // maps the http GET request
    public ResponseEntity<String> getNameById(@RequestParam("id") Integer aadharId){
        String name = aadharService.getNameByIdService(aadharId);
        return new ResponseEntity<>(name, HttpStatus.CREATED);
    }
}

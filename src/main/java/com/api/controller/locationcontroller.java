package com.api.controller;

import java.util.List;

import com.api.model.location;
import com.api.repo.locationRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(maxAge = 3600)
public class locationcontroller {
    @Autowired(required = true)
    private locationRepo repo;

    @GetMapping(value = "/test")
    public String test(){
        return "test";
    }


    @GetMapping(value = "/locations")
    public List<location> getLocations(){
        return repo.findAll() ;
    }
}
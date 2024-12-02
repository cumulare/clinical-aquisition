package com.cumulare.clinical.acquisition.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/v1/immunizations")
public class ImmunizationsController {

    @GetMapping(path = "")
    public ResponseEntity<String> GetAllImmunizations(){

        return  new ResponseEntity<String>("All Immunizations", HttpStatus.OK);
    }
}

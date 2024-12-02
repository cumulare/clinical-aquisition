package com.cumulare.clinical.acquisition.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


@RestController
@RequestMapping(path = "/api/v1/immunizations")
public class ImmunizationsController {

    private final Logger logger = LoggerFactory.getLogger(ImmunizationsController.class);

    @GetMapping(path = "")
    public ResponseEntity<String> GetAllImmunizations(){

        logger.info("Retrieved request to get all immunizations");
        return  new ResponseEntity<String>("All Immunizations", HttpStatus.OK);
    }
}

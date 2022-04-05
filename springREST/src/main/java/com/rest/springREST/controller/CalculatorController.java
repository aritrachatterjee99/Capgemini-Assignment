package com.rest.springREST.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.rest.springREST.main.Calculator;
import com.rest.springREST.service.CalculatorService;

@RestController
public class CalculatorController {
        
    @Autowired
    CalculatorService calculatorService;
    
    @PostMapping("/calculator/add")
    public double add(@RequestBody Calculator value){
        return calculatorService.add(value);
    }

    @PostMapping("/calculator/subtract")
    public double subtract(@RequestBody Calculator value){
        return calculatorService.subtract(value);
    }

    @PostMapping("/calculator/multiply")
    public double multiply(@RequestBody Calculator value){
        return calculatorService.multiply(value);
    }

    @PostMapping("/calculator/divide")
    public double divide(@RequestBody Calculator value){
        return calculatorService.divide(value);
    }
}
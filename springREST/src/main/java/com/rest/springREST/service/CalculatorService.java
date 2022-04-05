package com.rest.springREST.service;

import org.springframework.stereotype.Service;

import com.rest.springREST.main.Calculator;

@Service
public class CalculatorService {

    public Calculator createvalues(){
        Calculator cal = new Calculator();
        return cal;
    }

    public double add(Calculator value){
        createvalues();
        return value.getNum1() + value.getNum2();
    }
    public double subtract(Calculator value){
        createvalues();
        return value.getNum1() - value.getNum2();
    }
    public double multiply(Calculator value){
        createvalues();
        return value.getNum1() * value.getNum2();
    }
    public double divide(Calculator value){
        createvalues();
        return value.getNum1() / value.getNum2();
    }
}
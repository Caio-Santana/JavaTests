/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sam.calculatorapp;

/**
 *
 * @author Caio
 */
public class Calculator {

    public Calculator() {
    }
    
    public double sum(double x, double y){
        return x + y;
    }
    
    public double subtract(double x, double y){
        return x - y;
    }
    
    public double multiply(double x, double y){
        return x * y;
    }
    
    public double divide(double x, double y){
        return y == 0 ? 0 : x / y;
    }
}

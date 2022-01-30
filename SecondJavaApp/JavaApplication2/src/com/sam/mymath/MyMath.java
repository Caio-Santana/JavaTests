/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sam.mymath;

/**
 *
 * @author Caio
 */
public final class MyMath {

    private MyMath() {
    }
    
    

    public static int fatorial(int num) {
        if (num <= 0) {
            return 0;
        }

        int fatorial = 1;
        while (num > 1) {
            fatorial *= num;
            num--;
        }
        return fatorial;
    }

    /**
     * @param val Valor acumulado do cálculo.
     * @param valToSum Valor que será somado.
     * @return Resultado da soma.
     */
    public static double sum(double val, double valToSum) {
        return val + valToSum;
    }
    
    /**
     * @param val Valor acumulado do cálculo.
     * @param valToSub Valor que será subtraído.
     * @return Resultado da subtração.
     */
    public static double subtract(double val, double valToSub) {
        return val - valToSub;
    }

    /**
     * @param val Valor acumulado do cálculo.
     * @param valToMult Valor pelo qual será multiplicado.
     * @return Resultado da multiplicação.
     */
    public static double multiply(double val, double valToMult) {
        return val * valToMult;
    }

    /**
     * @param val Valor acumulado do cálculo.
     * @param valToDiv Valor pelo qual será dividido.
     * @return Resultado da divisão.
     */
    public static double divide(double val, double valToDiv) {
        if (valToDiv == 0) {
            return val;
        }

        return val / valToDiv;
    }
    
}

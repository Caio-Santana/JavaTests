/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sam.example;

import com.sam.mymath.MyMath;
import java.util.Scanner;

/**
 *
 * @author Caio
 */
public class SecondJavaApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Calculator Java");
        double number = 0.0d;
        double result = 0.0d;
        char op = ' ';
        
        Scanner sc = new Scanner(System.in);

        number = Double.parseDouble(sc.nextLine());   
        op = sc.next().charAt(0);

        // Example with if chaining
        /*
        if (op == '+') {
            result = number + var2;
        } else if (op == '-') {
            result = number - var2;
        } else if (op == '*') {
            result = number * var2;
        } else if (op == '/') {
            result = number / var2;
        } else {
            result = 0.0d;
        }
         */
        
        // Example Switch 
        switch (op) {
            case '+':
                result =  MyMath.sum(result, number);
                break;
            case '-':
                result = MyMath.subtract(result, number);
                break;
            case '*':
                result = MyMath.multiply(result, number);
                break;
            case '/':
                result = MyMath.divide(result, number);
                break;
            default:
                System.out.println("invalid opcode: " + op);
                result = 0.0d;
                break;
        }

        System.out.println("Result: " + result);

    }

    //System.out.println("fatorial de 4: " + m.fatorial(4));
}

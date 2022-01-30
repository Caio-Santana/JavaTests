/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sam.calculatorapp;

import java.util.Scanner;

/**
 *
 * @author Caio
 */
public class Main {

    public static void main(String args[]) {

        //new CalculatorGUI().setVisible(true);
        Scanner sc = new Scanner(System.in);
        String letters = sc.next();
        sc.close();
        printAnagrams(letters);

    }

    private static void printAnagrams(String letters) {
        int maxIndex = letters.length() - 1;
        permute(letters, 0, maxIndex);

    }

    private static void permute(String letters, int startIndex, int maxIndex) {
        if (startIndex == maxIndex) {
            System.out.println(letters);
        } else {
            for (int i = startIndex; i <= maxIndex; i++) {
                letters = swap(letters, startIndex, i);
                permute(letters, startIndex + 1, maxIndex);
                letters = swap(letters, startIndex, i);
            }
        }
    }

    private static String swap(String letters, int indexOne, int indexTwo) {
        char temp;
        char[] charArray = letters.toCharArray();
        temp = charArray[indexOne];
        charArray[indexOne] = charArray[indexTwo];
        charArray[indexTwo] = temp;
        return String.valueOf(charArray);
    }
}

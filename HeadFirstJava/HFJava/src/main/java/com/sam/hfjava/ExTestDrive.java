/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sam.hfjava;

/**
 *
 * @author Caio
 */
public class ExTestDrive {

    public static void main(String[] args) {
        String test = "yes";
        try {
            System.out.print("t");
            doRisky(test);
            System.out.print("r");
            System.out.print("o");
        } catch (MyEx e) {
            System.out.print("a");
        } finally {
            System.out.print("w");
            System.out.println("s");
        }
    }

    static void doRisky(String t) throws MyEx {
        System.out.print("h");
        if ("yes".equals(t)) {
            throw new MyEx();
        }
    }
}

class MyEx extends Exception {

}

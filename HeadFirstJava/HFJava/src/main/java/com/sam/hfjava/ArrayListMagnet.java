/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sam.hfjava;

import java.util.*;

/**
 *
 * @author Caio
 */
public class ArrayListMagnet {

    public static void main(String[] args) {
        ArrayList<String> a = new ArrayList<>();
        a.add(0, "zero");
        a.add(1, "one");
        a.add(2, "two");
        a.add(3, "three");
        printAl(a);
        a.remove(2);
        if (a.contains("two")) {
            a.add("2.2");
        }
        if (a.contains("three")) {
            a.add("four");
        }
        printAl(a);
        if (a.indexOf("four") != 4) {
            a.add(4, "4.2");
        }
        printAl(a);
        printAl(a);
    }

    public static void printAl(ArrayList<String> al) {
        for (String element : al) {
            System.out.print(element + " ");
        }
        System.out.println(" ");
    }
}

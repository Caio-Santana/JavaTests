package com.sam.collections;

import java.util.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Caio
 */
public class CollectionsApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Maps (igual ao Dictionary no .Net)
        Map<Integer,String> map = new HashMap<>();
        //Map<Integer,String> map = new TreeMap<>();
        map.put(1, "Mary");
        map.put(2, "John");
        map.put(3, "Bill");
        map.put(4, "Steve");
        map.forEach((t, u) -> {
            System.out.println("Nome: " + u + " id:" + t);
        });
        
        //LinkedList
        //Collection<Integer> linklist = new LinkedList<>();
        //ArrayList
        Collection<Integer> col = new ArrayList<>();
        col.add(11);
        col.add(5);
        col.add(8);
        col.add(9);
        
        System.out.println("Size: " + col.size());
        
        for (Integer i = 0; i < col.size(); i++) {
            System.out.println(i);
           col.remove(5);
        }
        
        System.out.println("Size: " + col.size());
        
    }
    
}

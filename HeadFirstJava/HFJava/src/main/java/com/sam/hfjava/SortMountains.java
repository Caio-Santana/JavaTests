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
public class SortMountains {

    LinkedList<Mountain> mtn = new LinkedList<>();

    public static void main(String[] args) {
        new SortMountains().go();
    }

    public void go() {
        mtn.add(new Mountain("Longs", 14255));
        mtn.add(new Mountain("Elbert", 14433));
        mtn.add(new Mountain("Maroon", 14156));
        mtn.add(new Mountain("Castle", 14265));

        System.out.println("as entered:\n" + mtn);

        NameCompare nc = new NameCompare();
        Collections.sort(mtn, nc);
        System.out.println("by name:\n" + mtn);
        
        HeightCompare hc = new HeightCompare();
        Collections.sort(mtn, hc);
        System.out.println("by height:\n" + mtn);
    }

    class NameCompare implements Comparator<Mountain> {

        @Override
        public int compare(Mountain one, Mountain two) {
            return one.getName().compareTo(two.getName());
        }

    }

    class HeightCompare implements Comparator<Mountain> {

        @Override
        public int compare(Mountain one, Mountain two) {
            return Integer.compare(two.getHeight(), one.getHeight());
        }

    }
}

class Mountain {

    private String name;
    private int height;

    public String getName() {
        return name;
    }

    public int getHeight() {
        return height;
    }

    public Mountain(String name, int height) {
        this.name = name;
        this.height = height;
    }
    
    @Override
    public String toString(){
        return getName() + " " + getHeight();
    }
}

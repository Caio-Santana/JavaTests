/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sam.hfjava.PuzzleThread;

/**
 *
 * @author Caio
 */
class Accum {

    private int counter = 0;

    private static Accum a = new Accum();

    private Accum() {
    }

    public static Accum getAccum() {
        return a;
    }

    public void updateCounter(int add) {
        counter += add;
    }

    public int getCount() {
        return counter;
    }
}

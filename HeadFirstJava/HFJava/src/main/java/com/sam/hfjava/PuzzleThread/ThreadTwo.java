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
class ThreadTwo implements Runnable {

    Accum a = Accum.getAccum();

    @Override
    public void run() {
        for (int x = 0; x < 99; x++) {
            a.updateCounter(1);
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
            }
        }
        System.out.println("two " + a.getCount());
    }

}

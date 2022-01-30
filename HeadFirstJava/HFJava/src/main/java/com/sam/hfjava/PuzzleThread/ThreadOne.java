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
class ThreadOne implements Runnable {

    Accum a = Accum.getAccum();

    @Override
    public void run() {
        for (int x = 0; x < 98; x++) {
            a.updateCounter(1000);
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
            }
        }
        System.out.println("one " + a.getCount());
    }

}

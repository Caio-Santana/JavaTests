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
public class Main {

    public static void main(String[] args) {
        //testCompareTo();
        //beerSong();
        //codeMagnets();
        //poolPuzzleOne();
        //drumKit();
        //echo();
        //testArrays();
        //poolPuzzleTriangle();
        //puzzle4();
        //multiFor();
    }
    
    private static void testCompareTo() {
        
        Song s = new Song("Mario", "ABC", "10", "120");
        Song s2 = new Song("PETER", "BBB", "10", "120");
        Song s3 = new Song("GG", "AAB", "10", "120");
        Song s4 = new Song("GG", "BAB", "10", "120");
        
        ArrayList<Song> arr = new ArrayList();
        arr.add(s);
        arr.add(s2);
        arr.add(s3);
        arr.add(s4);
        
        System.out.println(s.compareTo(s2));
        
        System.out.println(arr);
        System.out.println("----");
        Collections.sort(arr);
        System.out.println(arr);
        
    }

    private static void beerSong() {
        int beerNum = 99;
        String word = "bottles";
        while (beerNum > 0) {
            if (beerNum == 1) {
                word = "bottle"; // singular, as in ONE bottle.
            }
            System.out.println(beerNum + " " + word + " of beer on the wall");
            System.out.println(beerNum + " " + word + " of beer.");
            System.out.println("Take one down.");
            System.out.println("Pass it around.");
            beerNum = beerNum - 1;
            if (beerNum == 0) {
                System.out.println("No more bottles of beer on the wall");
            }
        }
    }

    private static void codeMagnets() {
        int x = 3;
        while (x > 0) {
            if (x > 2) {
                System.out.print("a");
            }
            if (x == 2) {
                System.out.print("b c");
            }
            x = x - 1;
            System.out.print("-");
            if (x == 1) {
                System.out.print("d");
                x = x - 1;
            }
        }
    }

    private static void poolPuzzleOne() {
        int x = 0;
        while (x < 4) {
            System.out.print("a");
            if (x < 1) {
                System.out.print(" ");
            }
            System.out.print("n");
            if (x > 1) {
                System.out.print(" oyster");
                x = x + 2;
            }
            if (x == 1) {
                System.out.print("noys");
            }
            if (x < 1) {
                System.out.print("oise");
            }
            System.out.println("");
            x = x + 1;
        }
    }

    private static void drumKit() {
        DrumKit d = new DrumKit();

        if (d.snare == true) {
            d.playSnare();
        }
        d.snare = false;
        d.playTopHat();
    }

    private static void echo() {
        Echo e1 = new Echo();
        Echo e2 = new Echo();
        int x = 0;
        while (x < 4) {
            e1.hello();
            e1.count = e1.count + 1;
            if (x == 3) {
                e2.count = e2.count + 1;
            }
            if (x > 0) {
                e2.count = e2.count + e1.count;
            }
            x = x + 1;
        }
        System.out.println(e2.count);
    }

    private static void testArrays() {
        int y = 0;
        int[] index = new int[4];
        index[0] = 1;
        index[1] = 3;
        index[2] = 0;
        index[3] = 2;

        String[] islands = new String[4];
        islands[0] = "Bermuda";
        islands[1] = "Fiji";
        islands[2] = "Azores";
        islands[3] = "Cozumel";

        int ref;
        while (y < 4) {
            ref = index[y];
            System.out.print("island = ");
            System.out.println(islands[ref]);
            y = y + 1;
        }
    }

    private static void poolPuzzleTriangle() {
        int x = 0;
        Triangle[] ta = new Triangle[4];
        while (x < ta.length) {
            ta[x] = new Triangle();
            ta[x].height = (x + 1) * 2;
            ta[x].length = x + 4;
            ta[x].setArea();
            System.out.print("triangle " + x + ", area");
            System.out.println(" = " + ta[x].area);
            x++;
        }
        int y = x;
        x = 27;
        Triangle t5 = ta[2];
        ta[2].area = 343;
        System.out.print("y = " + y);
        System.out.println(", t5 area = " + t5.area);
    }

    private static void puzzle4() {
        Puzzle4b[] obs = new Puzzle4b[6];
        int y = 1;
        int x = 0;
        int result = 0;
        while (x < 6) {
            obs[x] = new Puzzle4b();
            obs[x].ivar = y;
            y = y * 10;
            x = x + 1;
        }
        x = 6;
        while (x > 0) {
            x = x - 1;
            result = result + obs[x].doStuff(x);
        }
        System.out.println("result " + result);
    }

    private static void multiFor() {
        for (int x = 0; x < 4; x++) {
            for (int y = 4; y > 2; y--) {
                System.out.println(x + " " + y);
            }
            if (x == 1) {
                x++;
            }
        }
    }

}

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
public class DotComBust {

    private GameHelper helper = new GameHelper();
    private ArrayList<DotCom> dotComList = new ArrayList<>(3);
    private int numOfGuesses = 0;
    private ArrayList<String> guesses = new ArrayList<>(9);
    
    public static void main(String[] args) {        
        DotComBust game = new DotComBust();
        game.setUpGame();
        game.startPlaying();
    }

    public void setUpGame() {
        DotCom dc1 = new DotCom();
        DotCom dc2 = new DotCom();
        DotCom dc3 = new DotCom();

        dc1.setName("Bing.com");
        dc2.setName("Google.com");
        dc3.setName("Yahoo.com");

        dotComList.add(dc1);
        dotComList.add(dc2);
        dotComList.add(dc3);

        System.out.println("Your goal is to sink  three dot coms.");
        System.out.println("Bing.com, Google.com, Yahoo.com");
        System.out.println("Try to sink them all in fewest number of guesses");

        for (DotCom dotComToSet : dotComList) {
            ArrayList<String> newLocation = helper.placeDotCom(3);
            dotComToSet.setLocationCells(newLocation);
        }

    }

    public void startPlaying() {
        while (!dotComList.isEmpty()) {
            String userGuess = helper.getUserInput("Enter a guess");
            guesses.add(userGuess);
            checkUserGuess(userGuess);
            System.out.println("");
            
            System.out.print("guessed: ");
            guesses.forEach(g -> System.out.print(g + " "));
            System.out.println("");
        }
        finishGame();
    }

    public void checkUserGuess(String userGuess) {
        numOfGuesses++;
        String result = "miss";

        for (DotCom dotComToTest : dotComList) {
            result = dotComToTest.checkYourself(userGuess);
            if (result.equals("hit")) {
                break;
            }
            if (result.equals("kill")) {
                dotComList.remove(dotComToTest);
                break;
            }
        }
        System.out.println(result);
    }

    public void finishGame() {
        System.out.println("All Dot Coms are dead! Your stock is now worthless.");
        if (numOfGuesses <= 18) {
            System.out.println("It only took you " + numOfGuesses + " guesses.");
            System.out.println("You got out before your options sank.");
        } else {
            System.out.println("Took you long enough. " + numOfGuesses + " guesses.");
            System.out.println("Fish are dancing with your options.");
        }
    }
}

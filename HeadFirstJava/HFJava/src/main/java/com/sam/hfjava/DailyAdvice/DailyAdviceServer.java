/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sam.hfjava.DailyAdvice;

import java.io.*;
import java.net.*;

/**
 *
 * @author Caio
 */
public class DailyAdviceServer {
    
    String[] adviceList = {"Take smaller bites", "Go for the tight jeans. No they do NOT make you look fat.", 
        "One word: inappropriate", "Just for today, be honest. Tell your boss what you *really* think", 
        "You might want to rethink that haircut."};

    public static void main(String[] args) {
        DailyAdviceServer server = new DailyAdviceServer();
        server.go();
    }

    public void go() {
        try {
            ServerSocket serverSocket = new ServerSocket(4242);
            
            while (true) {                
                Socket socket = serverSocket.accept();
                
                PrintWriter writer = new PrintWriter(socket.getOutputStream());
                String advice = getAdvice();
                writer.println(advice);
                writer.close();
                System.out.println(advice);
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }        
    }

    private String getAdvice() {
        int random = (int) (Math.random() * adviceList.length);
        return adviceList[random];
    }
}

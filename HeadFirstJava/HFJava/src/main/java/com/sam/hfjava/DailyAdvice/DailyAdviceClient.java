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
public class DailyAdviceClient {

    public static void main(String[] args) {
        DailyAdviceClient client = new DailyAdviceClient();
        client.go();
    }

    public void go() {
        try {
            Socket socket = new Socket("127.0.0.1", 4242);
            
            InputStreamReader streamReader = new InputStreamReader(socket.getInputStream());
            BufferedReader reader = new BufferedReader(streamReader);
            
            String advice = reader.readLine();
            System.out.println("Today you should: " + advice);
            
            reader.close();
            
            
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}

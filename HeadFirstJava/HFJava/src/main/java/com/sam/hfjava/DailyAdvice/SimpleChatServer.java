/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sam.hfjava.DailyAdvice;

import java.io.*;
import java.util.*;
import java.net.*;

/**
 *
 * @author Caio
 */
public class SimpleChatServer {

    ArrayList clientOutputStreams;

    public class ClientHandler implements Runnable {

        BufferedReader reader;
        Socket sock;

        public ClientHandler(Socket clientSocket) {
            try {
                this.sock = clientSocket;
                InputStreamReader isReader = new java.io.InputStreamReader(sock.getInputStream());
                reader = new java.io.BufferedReader(isReader);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        @Override
        public void run() {
            String message;
            try {
                while ((message = reader.readLine()) != null) {
                    System.out.println("read " + message);
                    tellEveryone(message);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        new SimpleChatServer().go();
    }

    public void go() {
        clientOutputStreams = new ArrayList();
        try {
            ServerSocket serverSock = new java.net.ServerSocket(5000);
            while (true) {
                Socket socketClient = serverSock.accept();
                PrintWriter writer = new java.io.PrintWriter(socketClient.getOutputStream());
                clientOutputStreams.add(writer);

                Thread t = new Thread(new ClientHandler(socketClient));
                t.start();
                System.out.println("got a connection");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void tellEveryone(String message) {
        Iterator it = clientOutputStreams.iterator();
        while (it.hasNext()) {
            try {
                PrintWriter writer = (PrintWriter) it.next();
                writer.println(message);
                writer.flush();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

}

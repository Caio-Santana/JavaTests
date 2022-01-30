/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package japp;

import java.util.Scanner;

/**
 *
 * @author Caio
 */
public class JApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        System.out.println("JApp");

        Customer c1 = new Customer(1, "Marcus", "marc@gmail.com");
        System.out.println(c1);
        
        String name, email;
        
        Scanner scan = new Scanner(System.in);
        
        name = scan.nextLine();
        email = scan.nextLine();
        
        Customer c2 = new Customer(2, name, email);
        
        System.out.println(c2);
        
        
    }

}

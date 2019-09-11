/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.novi.oefeningscannerequals;

import java.util.Scanner;

/**
 *
 * @author jasonbakker
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s = new Scanner(System.in);
        
        System.out.print("Type my full name: ");      
        
        boolean checkout = false;
        boolean nameCheck = true;                     
        
        while(!checkout){
        String sc = s.nextLine();          
            
        if(sc.equals("Jason")){
            System.out.println("You typed Jason");
            checkout = true;
        }
        else if(sc.equals("Jason Bakker")){
            System.out.println("You typed Jason Bakker");
            checkout = true;
        }
        else if(sc.equals("Jason Raymond Bakker")){
            System.out.println("You typed Jason Raymond Bakker");
            checkout = true;
        }
        else {
        System.out.println("You didn't typed Jason Raymond Bakker. Try again!");         
            }      
     }
    }
}
    



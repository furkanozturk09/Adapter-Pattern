/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab9;

import java.util.Scanner;


public class Lab9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);  
        System.out.println("Enter your text: ");
        String s = in.nextLine();
        System.out.println("Enter printer type:  (char or buffer) ");
        String type = in.nextLine();
        System.out.println("Printing...");      
        
        PrinterAdapter printer = new PrinterAdapter(type);
        printer.print(type, s);      
    }   
}


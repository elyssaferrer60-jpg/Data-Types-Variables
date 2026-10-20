/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.overflowandreferenceinvestigator;

/**
 *
 * @author elyssa ferrer
 */
public class OverflowandReferenceInvestigator {

    public static void main(String[] args) {
        
        byte number = 120;
        number++;
        
        System.out.println(number);
        // Explanation: The maximum value for byte is 127. When incremented,
        // it wraps around to the smallest value: -128
        System.out.println("\n===============");
        
        // String Comparison: == vs equals()
        String name1 = new String("Elyssa");
        String name2 = new String("Elyssa");
        String name3 = "Elyssa";
        
        // compares memory references / whether they are the same object
        System.out.println(name1 == name2); 
        System.out.println(name1 == name3); 
        System.out.println(name2 == name3); 
        System.out.println(name1.equals(name2)); 
        System.out.println(name1.equals(name3)); 
        System.out.println(name2.equals(name3)); 
        System.out.println("===============");
        
        // Reference Sharing — Array
        String[] cars = {"BMW", "Nissan", "Hyundai"};
        String[] cars2 = cars; 
        
        System.out.println("\nBefore modification");
        System.out.println("Cars[1]: " + cars[1]);
        System.out.println("Cars2[1]: " + cars2[1]);
        
        cars2[1] = "Ford"; 
        System.out.println("\nAfter Modification");
        System.out.println("Cars[1]: " + cars[1]); 
        System.out.println("Cars2[1]: " + cars2[1]);
    }
}
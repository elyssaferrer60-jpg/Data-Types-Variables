/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.unitcastingconverter;

/**
 *
 * @author elyssa ferrer
 */
public class UnitCastingConverter {

    public static void main(String[] args) {
       
        double centimeters = 255.00;
        
        System.out.println("=== Unit Converter: Centimeters → Meters ===");
        System.out.println("Total centimeters: " + centimeters + " cm\n");

        int wholeMeters = (int) (centimeters / 100); 
        double remainingCm = centimeters - (wholeMeters * 100);

        System.out.println("Whole meters: " + wholeMeters + " m");
        System.out.println("Remaining centimeters: " + remainingCm + " cm\n");

        int smallWholeNumber = 40;
        double widenedValue = smallWholeNumber; // 

        System.out.println("=== Implicit Widening Example ===");
        System.out.println("Original int value: " + smallWholeNumber);
        System.out.println("Widened to double: " + widenedValue);

        System.out.println("→ No cast needed: double is larger and can fully contain int values.\n");

        double preciseValue = 100;
        int narrowedValue = (int) preciseValue;

        System.out.println("=== Explicit Narrowing Example ===");
        System.out.println("Original double value: " + preciseValue);
        System.out.println("Narrowed to int: " + narrowedValue);

        System.out.println("→ Data lost: fractional/decimal portion is truncated, not rounded.");
    }
}

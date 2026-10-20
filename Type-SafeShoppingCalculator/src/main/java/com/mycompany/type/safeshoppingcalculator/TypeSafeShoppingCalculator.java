/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.type.safeshoppingcalculator;

/**
 *
 * @author elyssa ferrer
 */
public class TypeSafeShoppingCalculator {

        public static void main(String[] args) {

        int quantity = 5;
        double unitPrice = 100;
        String storeName = "MartyMart";

        double totalCost = quantity * unitPrice;

        System.out.println("Store Name: " + storeName);
        System.out.println("Quantity: " + quantity);
        System.out.println("Unit Price: ₱" + unitPrice);
        System.out.println("Total Cost: ₱" + totalCost);
    }
}


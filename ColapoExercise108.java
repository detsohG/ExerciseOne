/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colapoexercise1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Jerome Colapo
 */
public class ColapoExercise108 {

    public static void main(String[] args) throws IOException {
        final int dollars = 100, quarters = 25, dimes = 10, nickels = 5;
        
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("Enter cents:");
        
        String R = dataIn.readLine();
        int cents = Integer.parseInt(R);
        
        int dollar, quarter, dime, nickel;
        dollar = cents / 100;
        cents %= 100;
        quarter = cents / 25;
        cents %= 25;
        dime = cents / 10;
        cents %= 10;
        nickel = cents / 5;
        cents %= 5;
        System.out.println("Your change is: ");
        if (dollar != 0)
            System.out.print(dollar + " dollars, ");
        if (quarter != 0)
            System.out.print(quarter + " quarters, ");
        if (dime != 0)
            System.out.print(dime + " dimes, ");
        if (nickel != 0)
            System.out.print(nickel + " nickels, ");
        if (cents != 0)
            System.out.print(cents + " cents, ");
    }
    
}

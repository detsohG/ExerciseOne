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
public class ColapoExercise115 {

    public static void main(String[] args) throws IOException {
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
        final int boltPrice = 5, nutPrice = 3, washerPrice = 1;

        
        System.out.println("Number of bolts:");
        String b = dataIn.readLine();
        int bolts = Integer.parseInt(b);
        
        System.out.println("Number of nuts:");
        String n = dataIn.readLine();
        int nuts = Integer.parseInt(n);
        
        System.out.println("Number of washers:");
        String w = dataIn.readLine();
        int washers = Integer.parseInt(w);
        
        int totalCost = bolts * boltPrice + nuts * nutPrice + washers * washerPrice;
        System.out.println("Check the order \n\n" + "Total cost: " + totalCost);
    }
    
}

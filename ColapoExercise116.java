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
public class ColapoExercise116 {

    public static void main(String[] args) throws IOException {
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
        
        int capacity, reading, miles;

        System.out.println("Tank Capacity:");
        String c = dataIn.readLine();
        capacity = Integer.parseInt(c);
        
        System.out.println("Gage reading:");
        String r = dataIn.readLine();
        reading = Integer.parseInt(r);
        
        System.out.println("Miles per gallon:");
        String m = dataIn.readLine();
        miles = Integer.parseInt(m);
        
        reading = 100 / reading;
        int remaining = capacity / reading;
        System.out.println(remaining > 200 ? "Safe to Proceed!" : "Get Gas!");
    }
    
}

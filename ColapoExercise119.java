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
public class ColapoExercise119 {

    public static void main(String[] args) throws IOException {
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("Year of Birth:");
        String Y = dataIn.readLine();
        int y = Integer.parseInt(Y);
        
        System.out.println("Current year:");
        String c = dataIn.readLine();
        int current = Integer.parseInt(c);
        
        if (current < y)
            current += 100;
        
        System.out.println("Your age: " + (current - y));
    }
    
}

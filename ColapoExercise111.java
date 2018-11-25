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
public class ColapoExercise111 {


    public static void main(String[] args) throws IOException {
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
        final double g = 32.174;
        
        System.out.println("Enter the number of seconds");
        String T = dataIn.readLine();
        double t = Double.parseDouble(T), d = 0.5 * g * t * t;
        System.out.println("Distance: " + d + " feet");
    }
    
}

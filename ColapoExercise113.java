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
public class ColapoExercise113 {

    public static void main(String[] args) throws IOException {
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("Enter X:");
        String x = dataIn.readLine();
        double X = Double.parseDouble(x);
        
        System.out.println("Enter Y:");
        String y = dataIn.readLine();
        double Y = Double.parseDouble(y);
        System.out.println("Arithmetic mean: " + ((X+Y) / 2));
        System.out.println("Harmonic mean: " + (2 / ((1/X) + (1/Y))));
    }
    
}

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
public class ColapoExercise138 {

    public static void main(String[] args) throws IOException {
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
        
        double init, fin, gal, miles;
        System.out.println("Miles Per Gallon Program");
        
        System.out.println("Initial Miles:");
        String in = dataIn.readLine();
        init = Double.parseDouble(in);
        
        if (init < 0)
            System.out.println("bye");
        else {
            System.out.println("final Miles:");
            String f = dataIn.readLine();
            fin = Double.parseDouble(f);
            
            System.out.println("Gallons");
            String g = dataIn.readLine();
            gal = Double.parseDouble(g);
            
            miles = (fin - init) / gal;
            System.out.println("Miles per Gallon: " + miles);
        } 
    }
}

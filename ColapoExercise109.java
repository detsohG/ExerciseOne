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
public class ColapoExercise109 {

    public static void main(String[] args) throws IOException {
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter Voltage: ");
        String v = dataIn.readLine();
        int V = Integer.parseInt(v);
        
        System.out.println("Enter Resistance: ");
        String r = dataIn.readLine();    
        int R = Integer.parseInt(r);
        
        float I = (float) ((V + 0.0) / R);
        System.out.println("The Current is: " + I);
    }
    
}

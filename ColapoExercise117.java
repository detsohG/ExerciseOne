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
public class ColapoExercise117 {

    public static void main(String[] args) throws IOException {
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
        
        
        System.out.println("Enter weight:");
        String w = dataIn.readLine();
        int weight = Integer.parseInt(w);
        System.out.println(weight >= 30 && weight <= 250 ? "Allowed!" : "Not Allowed!");
    }
    
}

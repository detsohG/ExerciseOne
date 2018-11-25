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
public class ColapoExercise140 {

    public static void main(String[] args) throws IOException {
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
        
        double weight = 1, shipping = 0;
        while (true) {
            System.out.println("Weight of Order:");
            String w = dataIn.readLine();
            weight = Double.parseDouble(w);
            if (weight == 0)
                break;
            shipping = 0;
            if (weight > 10)
                shipping += 5.5;
            else
                shipping += 3;
            System.out.println("Shipping cost: $" + shipping);
        }
        System.out.println("bye");
    }
    
}

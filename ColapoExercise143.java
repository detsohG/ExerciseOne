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
public class ColapoExercise143 {

    public static void main(String[] args) throws IOException {
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("Enter effectiveness:");
        int month = 0;
        String e = dataIn.readLine();
        double effectiveness = Double.parseDouble(e);
        double half = effectiveness / 2;
        while (true) {
            System.out.print("month: " + (month++) + "\teffectiveness: " + effectiveness);
            effectiveness *= 0.96;
            if (effectiveness < half) {
                System.out.println();
                System.out.println("month: " + month + "\teffectiveness: " + effectiveness + " DISCARDED");
                break;
            }
            System.out.println();
        }
    }
    
}

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
public class ColapoExercise122 {

    public static void main(String[] args) throws IOException {
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
       
        System.out.println("Number of items:");
        String n = dataIn.readLine();
        int num = Integer.parseInt(n);
       
        System.out.println("Heating time:");
        String t = dataIn.readLine();
        double time = Double.parseDouble(t);
        
        switch(num) {
            case 1: break;
            case 2: time *= 1.50; break;
            case 3: time *= 2; break;
            default: time = 0;
        }
        System.out.println((time == 0 ? "Not Recommended!" : "Recommended time: " + time));
    }
    
}

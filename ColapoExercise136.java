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
public class ColapoExercise136 {

    public static void main(String[] args) throws IOException {
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("Initial number of stars:");
        String n = dataIn.readLine();
        int num = Integer.parseInt(n);
        for (int i = 0; i < num; i++) {
            for (int j = 1; j <= num - i; j++)
                System.out.print("*");
            System.out.println();
        }    
    }
}

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
public class ColapoExercise132 {

    public static void main(String[] args) throws IOException {
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
        
        int N;
        double sum = 0;
        System.out.println("Enter N:");
        String n = dataIn.readLine();
        N = Integer.parseInt(n);
        for (int i = 1; i <= N; i++)
            sum += 1.0 / i;
        System.out.println();
        System.out.println("Sum is: " + sum);
    }
    
}

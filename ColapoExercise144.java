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
public class ColapoExercise144 {

    public static void main(String[] args) throws IOException {
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
        final double epsilon = 1E-12;
        
        System.out.println("Enter x:");
        String X = dataIn.readLine();
        int x = Integer.parseInt(X);
        int n = 1;
        
        double term, sum = 1, N = x, f = 1;
        while (true) {
            term = N / f;
            sum += term;
            System.out.println("n:" + n + " term: " + term + "\tsum: " + sum);
            n++;
            if (term < epsilon)
                break;
            N *= x;
            f *= n;
        }
        System.out.println("my e^x: " + sum);
        System.out.println("real e^x: " + Math.exp(x));
    }
    
}

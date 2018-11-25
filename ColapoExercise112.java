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
public class ColapoExercise112 {

    public static void main(String[] args) throws IOException {
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter a double:");
        String x = dataIn.readLine();
        double X = Double.parseDouble(x), ans = Math.log(X) / Math.log(2);
        System.out.println("Base 2 log of " + X + " is " + ans);
    }
    
}

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
public class ColapoExercise107 {

    public static void main(String[] args) throws IOException {
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Input the cents:");
        String R = dataIn.readLine();
        int cents = Integer.parseInt(R);
        int dollars = cents / 100;
        System.out.println("That is " + dollars + " dollars and " + (cents % 100) + " cents");   
    }
    
}

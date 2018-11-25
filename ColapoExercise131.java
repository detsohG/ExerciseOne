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
public class ColapoExercise131 {

    public static void main(String[] args) throws IOException {
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
        
        int times, num, sum = 0;
        
        System.out.println("How many integers will be added:");
        String t = dataIn.readLine();
        times = Integer.parseInt(t);
        
        
        for (int i = 0; i < times; i++) {
            System.out.println("Enter an integer:");
            String n = dataIn.readLine();
            num = Integer.parseInt(n);
            sum += num;
        }
        System.out.println();
        System.out.println("The sum is: " + sum);
    }
    
}

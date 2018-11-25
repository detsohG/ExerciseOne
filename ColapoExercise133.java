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
public class ColapoExercise133 {

    public static void main(String[] args) throws IOException {
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
        
        double avg = 0, avgSq = 0, num, N, sd;
        System.out.println("Enter N:");
        String n = dataIn.readLine();
        N = Integer.parseInt(n);
        System.out.println("Enter the numbers:");
        for (int i = 0; i < N; i++) {
            String NUM = dataIn.readLine();
            num = Integer.parseInt(NUM);
            avg += num;
            avgSq += num * num;
        }
        avg /= N;
        avg *= avg;
        avgSq /= N;
        sd = Math.sqrt(avgSq - avg);
        System.out.println("Standard Deviation is: " + sd);
    }
    
}

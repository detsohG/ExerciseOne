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
public class ColapoExercise134 {

    public static void main(String[] args) throws IOException {
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
        
        int upper, sumSq = 0, sumCu = 0, j;
        
        System.out.println("Upper limit:");
        String u = dataIn.readLine();
        upper = Integer.parseInt(u);
        for (int i = 1; i <= upper; i++) {
            j = i * i;
            sumSq += j;
            sumCu += j * i;
        }
        System.out.println("The sum of Squares is: " + sumSq);
        System.out.println("The sum of Cubes is: " + sumCu);
    }
    
}

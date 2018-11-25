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
public class ColapoExercise130 {

    public static void main(String[] args) throws IOException {
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
        
        String word1, word2;
        
        System.out.println("Enter first word:");
        word1 = dataIn.readLine();
        
        System.out.println("Enter second word:");
        word2 = dataIn.readLine();
        
        System.out.println();
        System.out.print(word1);
        
        int dotLength = 30 - word1.length() - word2.length();
        
        for (int i = 0; i < dotLength; i++)
            System.out.print(".");
            System.out.println(word2);
    }
    
}

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
public class ColapoExercise128 {

    public static void main(String[] args) throws IOException {
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
        
        int start, end;
        
        System.out.println("Enter Start:");
        String s = dataIn.readLine();
        start = Integer.parseInt(s);
        
        System.out.println("Enter End:");
        String e = dataIn.readLine();
        end = Integer.parseInt(e);
        
        System.out.println();
        for (int i = start; i <= end; i++)
            System.out.println(i);
    }
    
}

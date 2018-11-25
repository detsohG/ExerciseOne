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
public class ColapoExercise114 {

    public static void main(String[] args) throws IOException {
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("Enter amount of purchases:");
        String P = dataIn.readLine();
        int purchase = Integer.parseInt(P);
        System.out.println("Discounted price: " + (purchase > 10 ? ((purchase / 10 ) * 9) : purchase));
    }
    
}

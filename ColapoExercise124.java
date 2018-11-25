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
public class ColapoExercise124 {

    public static void main(String[] args) throws IOException {
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
       
        int check, save;
        double charge;
        
        System.out.println("Checking Balance:");
        String c = dataIn.readLine();
        check = Integer.parseInt(c);
        
        System.out.println("Saving Balance:");
        String s = dataIn.readLine();
        save = Integer.parseInt(s);
        
        if (check > 1000 || save > 1500)
            charge = 0;
        else
            charge = 0.15;
        System.out.println("Charge: " + charge);
    }
    
}

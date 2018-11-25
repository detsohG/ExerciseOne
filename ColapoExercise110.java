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
public class ColapoExercise110 {

    public static void main(String[] args) throws IOException {
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
        
        double cost, khpy, annual, rounded_amount;
        
        System.out.println("Enter cost per kilowatt-hour in cents");
        String C = dataIn.readLine();
        cost = Double.parseDouble(C);
        
        System.out.println("Enter kilowatt-hours used per year");
        String k = dataIn.readLine();
        khpy = Double.parseDouble(k);
        
        annual = (khpy * cost / 100);
        rounded_amount = Math.round(annual * 10000.0) / 10000.0;
        System.out.println("Annual cost: " + rounded_amount);
    }
    
}

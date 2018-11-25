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
public class ColapoExercise142A {

    public static void main(String[] args) throws IOException {
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
        
        double balance = 1000, totalPayments = 0, monthlyPayment;
        System.out.println("Enter the montly payment:");
        String M = dataIn.readLine();
        monthlyPayment = Double.parseDouble(M);
        int i = 1;
        while (balance > 0) {
            balance += balance * 0.015;
            balance -= monthlyPayment;
            totalPayments += monthlyPayment;
            System.out.println("Month: " + (i++) + "\tbalance: " + balance + " total payments: " + totalPayments);
        }
    }
}

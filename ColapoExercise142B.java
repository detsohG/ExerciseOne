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
public class ColapoExercise142B {

    public static void main(String[] args) throws IOException {
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
        
        double balance, monthlyPayment, monthlyInterest, totalPayments = 0;
        System.out.println("Enter your balance:");
        String b = dataIn.readLine();
        balance = Double.parseDouble(b);
        
        System.out.println("Enter the montly interest:");
        String in = dataIn.readLine();
        monthlyInterest = Double.parseDouble(in);
        
        System.out.println("Enter the montly payment:");
        String M = dataIn.readLine();
        monthlyPayment = Double.parseDouble(M);
        
        int i = 1;
        while (balance > 0) {
            balance += balance * monthlyInterest / 100;
            balance -= monthlyPayment;
            totalPayments += monthlyPayment;
            System.out.println("Month: " + (i++) + "\tbalance: " + balance + " total payments: " + totalPayments);
        }
    }
}

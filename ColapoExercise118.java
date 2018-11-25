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
public class ColapoExercise118 {

    public static void main(String[] args) throws IOException {
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
        
        double priceA, priceB, percentA, percentB;

        System.out.println("Price per pound package A:");
        String a1 = dataIn.readLine();
        priceA = Double.parseDouble(a1);
        
        System.out.println("Percent lean package A:");
        String a2 = dataIn.readLine();
        percentA = Double.parseDouble(a2);
        
        System.out.println("Price per pound package B:");
        String b1 = dataIn.readLine();
        priceB = Double.parseDouble(b1);
        
        System.out.println("Percent lean package B:");
        String b2 = dataIn.readLine();
        percentB = Double.parseDouble(b2);
        
        percentA /= 100;
        percentB /= 100;
        
        double packageA = priceA * (2 - percentA), packageB = priceB * (2 - percentB);
        
        System.out.println("Package A cost per pound of lean:" + packageA);
        System.out.println("Package B cost per pound of lean:" + packageB);
        System.out.println(packageA < packageB ? "Package A is the best Value" : "Package B is the best Value");
    }
    
}

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
public class ColapoExercise125 {

    public static void main(String[] args) throws IOException {
       BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
       
       int leftFront, rightFront, leftRear, rightRear;

        System.out.println("Input right front pressure");
        String r = dataIn.readLine();
        rightFront = Integer.parseInt(r);
        
        System.out.println("Input left front pressure");
        String l = dataIn.readLine();
        leftFront = Integer.parseInt(l);
        
        System.out.println("Input right rear pressure");
        String r1 = dataIn.readLine();
        rightRear = Integer.parseInt(r1);
        
        System.out.println("Input left rear pressure");
        String l2 = dataIn.readLine();
        leftRear = Integer.parseInt(l2);
        
        System.out.println("Inflation is " + (leftFront == rightFront && leftRear == rightRear ? "OK" : "BAD"));  
    }
    
}

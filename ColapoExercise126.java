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
public class ColapoExercise126 {

    public static void main(String[] args) throws IOException {
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
        
        int leftFront, rightFront, leftRear, rightRear;
        boolean goodPressure = true;
        
        String error = "Warning: Pressure is out of range\n";
        
        System.out.println("Input right front pressure");
        String rf = dataIn.readLine();
        rightFront = Integer.parseInt(rf);
        if (rightFront < 35 || rightFront > 45) {
            goodPressure = false;
            System.out.println(error);
        }
       
        System.out.println("Input left front pressure");
        String lf = dataIn.readLine();
        leftFront = Integer.parseInt(lf);
        if (leftFront < 35 || leftFront > 45) {
            goodPressure = false;
            System.out.println(error);
        }
        
        System.out.println("Input right rear pressure");
        String rr = dataIn.readLine();
        rightRear = Integer.parseInt(rr);
        if (rightRear < 35 || rightRear > 45) {
            goodPressure = false;
            System.out.println(error);
        }
        
        System.out.println("Input left rear pressure");
        String lr = dataIn.readLine();
        leftRear = Integer.parseInt(lr);
        if (leftRear < 35 || leftRear > 45) {
            goodPressure = false;
            System.out.println(error);
        }
        System.out.println("Inflation is " + (leftFront == rightFront && leftRear == rightRear  && goodPressure ? "OK" : "BAD"));
        
    }
    
}

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
public class ColapoExercise139 {

    public static void main(String[] args) throws IOException {
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
        
        int low, high, data, inRange = 0, notInRange = 0;
        System.out.println("In-range Adder");
        
        System.out.println("Low end of range:");
        String l = dataIn.readLine();
        low = Integer.parseInt(l);
        
        System.out.println("High end of range:");
        String h = dataIn.readLine();
        high = Integer.parseInt(h);
        
        while (true) {
            System.out.println("Enter data:");
            String d = dataIn.readLine();
            data = Integer.parseInt(d);
            
            if (data == 0)
                break;
            if (data >= 20 && data <= 50)
                inRange += data;
            else
                notInRange += data;
        }
        System.out.println("Sum of in range values: " + inRange);
        System.out.println("Sum of out range values: " + notInRange);
    }
    
}

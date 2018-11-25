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
public class ColapoExercise141 {

    public static void main(String[] args) throws IOException {
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("Computer Aided Design Program");
        while (true) {
            int x1, y1, x2, y2, width, height, area;
            System.out.println("First corner X coordinate:");
            String X1 = dataIn.readLine();
            x1 = Integer.parseInt(X1);
            
            System.out.println("First corner Y coordinate:");
            String Y1 = dataIn.readLine();
            y1 = Integer.parseInt(Y1);
            
            System.out.println("Second corner X coordinate:");
            String X2 = dataIn.readLine();
            x2 = Integer.parseInt(X2);
            
            System.out.println("Second corner Y coordinate:");
            String Y2 = dataIn.readLine();
            y2 = Integer.parseInt(Y2);
            
            width = Math.abs(x1 - x2);
            height = Math.abs(y1 - y2);
            if (width == 0 || height == 0) {
                System.out.println("Cannot be a rectangle");
                break;
            }
            area = width * height;
            System.out.println("Width: " + width + " Height: " + height + " Area: " + area + "\n");
    }
   }
}

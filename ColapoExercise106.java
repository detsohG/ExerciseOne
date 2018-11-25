/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colapoexercise1;
import java.io.*;
/**
 *
 * @author Jerome Colapo
 */
public class ColapoExercise106 {

    public static void main(String[] args) throws IOException {
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("Input the radius:");
        
        String R = dataIn.readLine();
        double r = Double.parseDouble(R);
        double area = Math.PI * r * r;
        System.out.println("The radius is " + r + " The area is: " + area);
    }
    
}

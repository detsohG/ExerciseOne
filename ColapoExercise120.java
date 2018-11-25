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
public class ColapoExercise120 {

    public static void main(String[] args) throws IOException {
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
        
        double price;
        
        System.out.println("Enter the item:");
        String item = dataIn.readLine();
        
        System.out.println("Enter the price:");
        String p = dataIn.readLine();
        price = Double.parseDouble(p);
        
        System.out.println("Overnight delivery (0==no, 1==yes)");
        String o = dataIn.readLine();
        int overnight = Integer.parseInt(o);
        
        double shipping = price >= 10 ? 3 : 2;
        if (overnight == 1)
            shipping += 5;
        System.out.println("\nInvoice:");
        System.out.println(item + "\t" + price);
        System.out.println("shipping\t" + shipping);
        System.out.println("total\t" + (price + shipping));
    }
    
}

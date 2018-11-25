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
public class ColapoExercise121 {

    public static void main(String[] args) throws IOException {
       BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
      
       double tAir, tSteam, efficiency;
       
       System.out.println("Air temperature:");
       String tA = dataIn.readLine();
       tAir = Double.parseDouble(tA);
       
       System.out.println("Steam temperature:");
       String tS = dataIn.readLine();
       tSteam = Double.parseDouble(tS);
       
       efficiency = tSteam <  373 ? 0 : 1 - (tAir / tSteam);
       System.out.println("The efficiency is: " + efficiency);  
    }
    
}

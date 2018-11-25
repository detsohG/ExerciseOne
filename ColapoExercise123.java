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
public class ColapoExercise123 {

    public static void main(String[] args) throws IOException {
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
       
        int str, hp, luck, total;
        
        System.out.println("Welcome to Yertle's Quest");
        System.out.println("Enter the name of your character:");
        String name = dataIn.readLine();
        
        System.out.println("Enter htrength (1-10):");
        String STR = dataIn.readLine();
        str = Integer.parseInt(STR);
        
        System.out.println("Enter health (1-10):");
        String HP = dataIn.readLine();
        hp = Integer.parseInt(HP);
        
        System.out.println("Enter luck (1-10):");
        String LUCK = dataIn.readLine();
        luck = Integer.parseInt(LUCK);
        
        total = str + hp + luck;
        if (total > 15) {
            System.out.println("You have given your character too many points! Default values have been assigned:");
            str = 5;
            hp = 5;
            luck = 5;
        }
        System.out.println(name + ", strength: " + str + ", health: " + hp + ", luck: " + luck);
    }
    
}

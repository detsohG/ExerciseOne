/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colapoexercise1;

import java.util.Scanner;

/**
 *
 * @author Jerome Colapo
 */
public class ColapoExercise102 {

    public static void main(String[] args) {
        double x;
        double value;
        x = 0.0;
        value = 3 * x * x - 8 * x + 4;
        System.out.println("At X = " + x + " the value is: " + value);
        x = 2.0;
        value = 3 * x * x - 8 * x + 4;
        System.out.println("At X = " + x + " the value is: " + value);
        x = 4.0;
        value = 3 * x * x - 8 * x + 4;
        System.out.println("At X = " + x + " the value is: " + value);
    }
}
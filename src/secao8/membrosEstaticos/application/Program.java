/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package secao8.membrosEstaticos.application;

import java.util.Locale;
import java.util.Scanner;
import secao8.membrosEstaticos.util.Calculator;

/**
 *
 * @author Robson
 */
public class Program {
    public static void main(String[] args) {
//        Calculator calc = new Calculator();
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter radius:");
        double radius = sc.nextDouble();
        
        double c = Calculator.circumference(radius);
        
        double v = Calculator.volume(radius);
        
        System.out.printf("Circumference: %.2f%n", c);
        System.out.printf("Volume: %.2f%n", v);
        System.out.printf("PI value: %.2f%n", Calculator.PI);
        
        
        sc.close();
    }
}

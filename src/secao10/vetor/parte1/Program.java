/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package secao10.vetor.parte1;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Robson
 */
public class Program {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        double[] vect = new double[n];
        
        for(int i=0; i<n; i++){
            vect[i] = sc.nextDouble();
        }
        
        double sum = 0.0;
        for(int i = 0; i < n; i++){
            sum += vect[i];
        }
        double avg = sum / 3;
        
        System.out.printf("AVERAGE HEIGHT: %.2f%n", avg);
        
        sc.close();
    }
}

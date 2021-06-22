/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package secao8.membrosEstaticos.application;

import java.util.Locale;
import java.util.Scanner;
import secao8.membrosEstaticos.util.currencyConverter;

/**
 *
 * @author Robson
 */
public class cotacao {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Whais is the dollar price? ");
        double value = sc.nextDouble();
        
        System.out.println("How many dollars will be bought?");
        double qtd = sc.nextDouble();
        
        double conversao = currencyConverter.conversion(value, qtd);
        
        System.out.printf("Amount to ve paid in reais = %.2f%n", conversao);
        
        sc.close();
    }
}

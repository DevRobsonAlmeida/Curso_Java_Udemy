/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package secao10.vetor.parte2.application;

import java.util.Locale;
import java.util.Scanner;
import secao10.vetor.parte2.entite.product;

/**
 *
 * @author Robson
 */
public class program {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        
        System.out.println("Digite a quantidade de produtos que deseja cadastrar");
        int n = sc.nextInt();
        //
        product[] prod = new product[n];
        
        double sumPrice = 0;
        for (int i = 0; i < prod.length ; i++) {
            System.out.println("Nome do produto");
            String name =  sc.next();
            System.out.println("Preço do produto");            
            double price = sc.nextDouble();
            
            prod[i] = new product(name, price);
            
            sumPrice += prod[i].getPrice();
        }
        double avg = sumPrice / prod.length;
        
        System.out.printf("AVERAGE PRICE = %.2f", avg );
        
        sc.close();
    }
}

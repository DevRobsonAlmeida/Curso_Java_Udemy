/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package secao9.construtor.application;

import java.util.Locale;
import java.util.Scanner;
import secao9.construtor.entites.Product;

/**
 *
 * @author Robson
 */
public class Program {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter product data:");

        System.out.println("Name: ");
        String name = sc.next();

        System.out.println("Price:");
        double price = sc.nextDouble();

        Product produto = new Product(name, price);

        produto.setName("Computer");
        System.out.println("Update name:" + produto.getName());
        produto.setPrice(1200.00);
        System.out.println("Update price:" + produto.getPrice());
        
        System.out.println();
        System.out.println("Product data: " + produto);

         
        
        System.out.println();
        System.out.println("Enter the number of products to be added in stock: ");
        int quantity = sc.nextInt();
        produto.AddProducts(quantity);

        System.out.println("");
        System.out.println("Update data: " + produto);

        System.out.println("");
        System.out.println("Enter the number of products to be remove from stock");
        quantity = sc.nextInt();
        produto.RemoveProducts(quantity);

        System.out.println("");
        System.out.println("Update data: " + produto);

        sc.close();

    }
}

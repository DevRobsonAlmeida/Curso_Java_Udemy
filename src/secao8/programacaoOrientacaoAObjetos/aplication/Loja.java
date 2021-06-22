/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package secao8.programacaoOrientacaoAObjetos.aplication;

import secao8.programacaoOrientacaoAObjetos.entites.Produto;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Robson
 */
public class Loja {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        Produto produto = new Produto();
        
        System.out.println("Enter product data:");
        
        System.out.println("Name: ");
        produto.name = sc.next();
        
        System.out.println("Price:");
        produto.price = sc.nextDouble();
        
        System.out.println("Quantity in stock:");
        produto.qtd = sc.nextInt();
        
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

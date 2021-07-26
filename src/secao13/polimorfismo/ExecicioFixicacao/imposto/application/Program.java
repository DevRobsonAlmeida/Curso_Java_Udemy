/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package secao13.polimorfismo.ExecicioFixicacao.imposto.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import secao13.polimorfismo.ExecicioFixicacao.imposto.entites.Company;
import secao13.polimorfismo.ExecicioFixicacao.imposto.entites.Individual;
import secao13.polimorfismo.ExecicioFixicacao.imposto.entites.TexPayer;

/**
 *
 * @author robson-pc
 */
public class Program {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //
        TexPayer t;
        //
        List<TexPayer> list = new ArrayList<>();
        
        
        System.out.print("Enter the number of taxpayers: ");
        int n = sc.nextInt();
        
        for (int i = 1; i <= n; i++) {
            System.out.println("TaxPayer #" + i + " data:");
            System.out.print("Individual or company (i/c): ");
            char letra = sc.next().toLowerCase().charAt(0);
            
            System.out.println("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            
            System.out.println("Anual income: ");
            Double anualIncome = sc.nextDouble();
            
            
            
            if (letra == 'i') {
                System.out.println("Health exepnditures: ");
                Double healtExpenditures = sc.nextDouble();
                
                t = new Individual(name, anualIncome, healtExpenditures);
                
            }else{
                System.out.println("Number of employees: ");
                Integer numberOfEmployees = sc.nextInt();
                
                t = new Company(name, anualIncome, numberOfEmployees);
            }
            
            list.add(t);
        }
        
        
        System.out.println("");
        for (TexPayer texPayer : list) {
            System.out.println(texPayer.getName() + ": $ " + String.format("%.2f", texPayer.tax()));
        }
        
        
        
    }
    
}

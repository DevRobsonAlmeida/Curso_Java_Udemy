/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package secao10.LacoForEach;

/**
 *
 * @author Robson
 */
public class program {
    public static void main(String[] args) {
        //For each
        // É um sintaxe opcional e simplificada para percorrer coleções
        
        String[] vect = new String[] {"Maria", "Bob", "Alex"};
        
        //Nesse caso ele percorre as indice do vetor
        for (int i = 0; i < vect.length; i++) {
            System.out.println(vect[i]);
        }
        
        System.out.println("---------------------------");
        //Sintaxe:
        for (String obj : vect ) {
            System.out.println(obj);
        }
    }
   
}

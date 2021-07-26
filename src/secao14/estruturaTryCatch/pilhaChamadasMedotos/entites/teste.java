/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package secao14.estruturaTryCatch.pilhaChamadasMedotos.entites;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author 99030499
 */
public class teste {
    
    public static void method() {
        System.out.println("***METHOD START***");
        method2();
        System.out.println("***METHOD END***");
    }

    public static void method2() {
        System.out.println("***METHOD2 START***");
        Scanner sc = new Scanner(System.in);

        try {
            String[] vect = sc.nextLine().split(" ");
            int position = sc.nextInt();
            System.out.println(vect[position]);
        } catch (ArrayIndexOutOfBoundsException e) { // Exceção para quando inserir um indice que não existe
            System.out.println("Invalid position");
            e.printStackTrace();
        } catch (InputMismatchException i) { // Exceção para quando setar um dados de tipo deferente
            System.out.println("Invalid error");
        }

        sc.close();
        System.out.println("***METHOD2 END***");
    }
}

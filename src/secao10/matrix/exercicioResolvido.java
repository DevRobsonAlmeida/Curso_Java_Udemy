/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package secao10.matrix;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Robson
 */
public class exercicioResolvido {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] mat = new int[n][n];

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                mat[i][j] = sc.nextInt();
            }
        }

        System.out.println("Main diagonal: ");
        for (int i = 0; i < mat.length; i++) {
            System.out.print(mat[i][i] + " ");
        }
        System.out.println("");

        int count = 0;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j] < 0) {   
                    count++;
                }
            }
        }
        System.out.println("Quantidade de numero negativos " + count);

        sc.close();
    }
}

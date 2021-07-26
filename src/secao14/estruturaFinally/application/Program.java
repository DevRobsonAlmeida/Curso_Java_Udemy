/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package secao14.estruturaFinally.application;

import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.FileSystemNotFoundException;
import java.util.Scanner;

/**
 *
 * @author 99030499
 */
public class Program {

    public static void main(String[] args) {
        File file = new File("C:\\Projetos\\JavaEstudo\\Praticando\\Curso_Java_Udemy\\src\\arquivosTxt\\in.txt");
        Scanner sc = null;
        try {
            sc = new Scanner(file);
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error opening file: " + e.getMessage());
        }finally{
            if ( sc != null) {
                sc.close();
            }
            System.out.println("Finally block executed");
        }
    }
}

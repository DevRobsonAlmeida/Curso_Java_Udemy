/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package secao13.polimorfismo.abstractType.modulos.application;


import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import secao13.polimorfismo.abstractType.modulos.entites.Circle;
import secao13.polimorfismo.abstractType.modulos.entites.Rectangle;
import secao13.polimorfismo.abstractType.modulos.entites.Shape;
import secao13.polimorfismo.abstractType.modulos.entites.emuns.Color;

/**
 *
 * @author 99030499
 */
public class Program {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        //
        Shape s;
        //
        List<Shape> list = new ArrayList<>();

        System.out.print("Enter the number of shapes: ");
        int number = sc.nextInt();

        for (int i = 1; i <= number; i++) {
            System.out.print("Shape #" + i + " data: ");
            System.out.print("Reactangle or Circle (r/c)");
            char letra = sc.next().charAt(0);
            System.out.print("Color (BLACK/ BLUE/ RED): ");
            Color color = Color.valueOf(sc.next());
            if (letra == 'r') {
                System.out.print("Width: ");
                Double Width = sc.nextDouble();
                System.out.print("Height: ");
                Double Height = sc.nextDouble();
                s = new Rectangle(color, Width, Height);
            } else {
                System.out.println("Radius: ");
                Double radius = sc.nextDouble();
                s = new Circle(color, radius);
            }
            list.add(s);
            
            for (Shape shape : list) {
                System.out.println(shape.getArea());
            }

        }

    }
}

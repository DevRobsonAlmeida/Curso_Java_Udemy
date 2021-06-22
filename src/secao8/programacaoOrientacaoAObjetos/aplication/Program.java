package secao8.programacaoOrientacaoAObjetos.aplication;

import secao8.programacaoOrientacaoAObjetos.entites.Triangle;
import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
                Triangle x , y;
                
                x = new Triangle();
                y = new Triangle();
		
		System.out.println("Enter the measures of triangle X: ");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		System.out.println("Enter the measures of triangle y: ");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
                
		System.out.printf("Triangle X area %.4f%n", x.area());
		System.out.printf("Triangle X area %.4f%n", y.area());
		
		if (x.area() > y.area()) {
			System.out.println("Larger area: X");
		}else if(y.area() > x.area()) {
			System.out.println("Larger area: Y");
		}else{
                    System.out.println("Eguals");
                }
	}

}

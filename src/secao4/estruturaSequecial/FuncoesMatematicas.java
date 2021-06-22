package secao4.estruturaSequecial;

import java.util.Scanner;

public class FuncoesMatematicas {

	public static void main(String[] args) {
	/**
	 * Algumas funções da matemáticas 
	 * Math.sqrt(x), usado para receber a raiz quadrada.
	 * Math.pow(x, y), usado para elevar um valor sobre o outro. Ex 2²
	 * Math.abs(x), usado para receber o valor absoluto.
	 */
		
	double x = 3.0;
	double y = 4.0;
	double z = -5.0;
	double A, B, C;
	
	A = Math.sqrt(x);
	B = Math.sqrt(y);
	C = Math.sqrt(25.0);
	System.out.println("Os valores e sua raiz quadrada");
	System.out.println("raiz de " + x + " - " + A);
	System.out.println("raiz de " + y + " - " + B);	
	System.out.println("raiz de 25.0 - " + C);
	
	System.out.println();
	
	A = Math.pow(x, y);
	B = Math.pow(x, 2.0);
	C = Math.pow(5.0, 2.0);
	System.out.println("Elevação");
	System.out.println(x + " elevado a " + y + " - " + A);
	System.out.println(x + " elevado a 2.0 - " + B);	
	System.out.println("5.0 elevado a 2.0 - " + C);
	
	System.out.println();
	
	A = Math.abs(y);
	B = Math.abs(z);
	System.out.println("Os valores absoluto");
	System.out.println("absoluto de " + y + " - " + A);
	System.out.println("absoluto de " + z + " - " + B);	
	
	System.out.println();
	
	//Formola de baskara
	
	System.out.println("Formula de baskara");
	
	Scanner sc = new Scanner (System.in);
	
	double delta, b, a, c, x1, x2;
	
	a = sc.nextDouble();
	b = sc.nextDouble();
	c = sc.nextDouble();
	
	delta = Math.pow(b, 2.0) - 4 * a * c;
	
	x1 = (-b + Math.sqrt(delta)) / (2.0 * a);
	x2 = (-b - Math.sqrt(delta)) / (2.0 * a);
	
	System.out.println("Delta - " + delta);
	System.out.printf("x1 - %.2f%n", x1);
	System.out.printf("x2 - %.2f%n", x2);	
	sc.close();
	
	
	}

}

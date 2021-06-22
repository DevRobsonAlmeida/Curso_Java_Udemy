package secao6.estruturaRepetitivas;

import java.util.Scanner;

public class EstruturaRepetitivaFacaEnquato {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		double c = 0;
		double f = 0;
		double f2 = 0;
		char resposta;
		do {
			System.out.println("Digite a temperatura Celsius:");
			c = sc.nextDouble();
			f = ((9*c)/5) + 32;
			f2 = (c * 1.8) + 32;
			System.out.println("Equivalente em fahrenheit: " + f);
			System.out.println("Equivalente em fahrenheit (Formula resumida): " + f2);
			System.out.println("Deseja continuar (s/n)?");
			resposta = sc.next().charAt(0);
			System.out.println();
		} while(resposta == 's');
	}

}

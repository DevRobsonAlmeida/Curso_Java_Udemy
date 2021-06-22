package secao4.estruturaSequecial;

import java.util.Locale;
import java.util.Scanner;

public class EntradaDeDados {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
//		Scanner permite que ele reconheca o que foi escrito no terminal
		Scanner sc = new Scanner(System.in);
//		 Exemplo com tipos de vari�veis

//		EXEMPLO 1 - Tipo String
		String palavra;
		palavra = sc.next();

//		Exemplo 2 - Tipo inteiro
		int inteiro = sc.nextInt();

//		Exemplo 3 - Tipo Double
		double decimal = sc.nextDouble();

//		Exemplo 4 - Tipo char, mas limitando a quantidade de caracteres
		char caracter = sc.next().charAt(0);

		System.out.println("você digitou ");
		System.out.println(palavra);
		System.out.println(inteiro);
		System.out.println(decimal);
		System.out.println(caracter);
		

		sc.close();
	}

}

package secao4.estruturaSequecial;

import java.util.Locale;

public class SaidaDeDados {

	public static void main(String[] args) {
		int inteiro = 32;

		System.out.println(inteiro);

		double completo = 110.186841;

		System.out.println(completo);
		System.out.printf("%.2f%n", completo);

//		Esse método servirá para colocar a localização do programa
		Locale.setDefault(Locale.US);

//		printf, nesse caso fez a formatação
//		limitou a quantidade de casas decimais com o comando 
//		printf("%.<quantidade de casas>f%n",<Variavel>)
		System.out.printf("%.2f%n", completo);

//		Concatenar 
		System.out.println("Resultado " + completo + " metros");

		System.out.printf("Resaultado %.2f metros%n", completo);

//	   ---------------------------------------------------------
	/**
	 * 	PARA CONCATENAR VÁRIOS ELEMENTOS EM UM MESMO COMANDO DE ESCRITA
	 * 		%f = ponto flutuante 
	 * 		%d = inteiro
	 * 		%s = texto
	 * 		%n = quebra de linha
	 */
		

		System.out.println("-----------------------");
		String nome = "Maria";
		int idade = 31;
		double renda = 4000.0;
		System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda);
	}

}

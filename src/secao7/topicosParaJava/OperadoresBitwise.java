package secao7.topicosParaJava;

import java.util.Scanner;

public class OperadoresBitwise {
	public static void main(String[] args) {
		
		/**
		 * 	Operadores bitwise
		 * 	Operador	|	Siginificado
		 * 		&		|	Operador "E" bit a bit
		 * 		|		|	Operador "OU" bit a bit
		 * 		^  		| 	Operador "OU-exclusivo" bit a bit
		 */
		
		//Exmplo 1
		int n1 = 89;
		int n2 = 60;
		
		System.out.println(n1 & n2);
		System.out.println(n1 | n2);
		System.out.println(n1 ^ n2);
		
		
		//Exemplo 2 - aplicação comum: verificar um bit
		
		Scanner sc = new Scanner(System.in);
		
		int mask = 32;
		int n = sc.nextInt();
		
		if ((n & mask) != 0) {
			System.out.println("6th bit is true!");
		} else {
			System.out.println("6th bit is false!");
		}
	}
}

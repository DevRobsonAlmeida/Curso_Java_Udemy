package secao6.estruturaRepetitivas;

import java.util.Scanner;

public class EstruturaRepetitivaEnquanto {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int soma = 0;
		int qtd = (x != 0) ? 1 : 0;
		
		//Enquanto(while) o valor não for zero, ele continuara rodando 
		while(x != 0) {
			soma += x;
			x = sc.nextInt();
			qtd++;
		}
		
		System.out.println("Soma dos numero digitados: " + soma);
		System.out.println("Quantidade de numeros: " + qtd );
		
		sc.close();
	}
}

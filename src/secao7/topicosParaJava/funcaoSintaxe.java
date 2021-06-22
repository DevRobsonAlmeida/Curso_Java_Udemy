package secao7.topicosParaJava;

import java.util.Scanner;

public class funcaoSintaxe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter three numbers: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int higher = max(a, b, c);
		
		showResult(higher);
		
		sc.close();
		
	}
	
	public static int max(int primeiroValor, int segundoValor, int terceiroValor) {
		int aux;
		
		if (primeiroValor > segundoValor && primeiroValor > terceiroValor) {
			aux = primeiroValor;
		}
		else if(segundoValor > terceiroValor) {
			aux = segundoValor;
		}
		else {
			aux = terceiroValor;
		}
		
		return aux;
	}
	
	public static void showResult(int value) {
		System.out.println("Higher " + value);
	}

}

package secao6.estruturaRepetitivas;

import java.util.Scanner;

public class EstruturaRepetitivaPara {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = 3;
		
		int soma = 0;
		for(int i = 0; N > i; i++) {
			int x = sc.nextInt();
			soma += x;
		}
		 System.out.println(soma);
		
	}
}

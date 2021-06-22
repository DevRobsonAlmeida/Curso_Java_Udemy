package secao4.estruturaSequecial;

import java.util.Scanner;

public class EntradaDeDados2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		int dia;
		String nome, nome2, nome3;
		//nextLine, usado para ler a linha inteira
		dia = sc.nextInt();
		sc.nextLine();
		nome = sc.nextLine();
		nome2 = sc.nextLine();
		nome3 = sc.nextLine(); 
		
		System.out.println("Dados armazenados:");
		System.out.println(dia);
		System.out.println(nome);
		System.out.println(nome2);
		System.out.println(nome3);	
		
		sc.close();
	}
}

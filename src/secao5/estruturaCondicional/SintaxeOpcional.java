package secao5.estruturaCondicional;

import java.util.Locale;
import java.util.Scanner;

public class SintaxeOpcional {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		//Problema
		//Exemplo 1
		
		int minutos = sc.nextInt();
		
		double conta = 50.0;
		
		if (minutos > 100) {
			//Oparador de atrubito cumulativo
			//Permite que a expresão venha a ser antes do sinal de "="
			conta +=  (minutos - 100) * 2.0;
		}
		
		System.out.printf("Valor da conta = R$ %.2f%n", conta);
		
		
		
		
		
		sc.close();
		
	}
}

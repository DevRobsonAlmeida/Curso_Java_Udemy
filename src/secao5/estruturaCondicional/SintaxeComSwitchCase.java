package secao5.estruturaCondicional;

import java.util.Scanner;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter.DEFAULT;

public class SintaxeComSwitchCase {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um numero de 1 á 7");

		int numeroSemana = sc.nextInt();
		String dia = "";

		switch (numeroSemana) {
		case 1:
			dia = "Domingo";
			break;
		case 2:
			dia = "Segundo-dia";
			break;
		case 3:
			dia = "Terça-feira";
			break;
		case 4:
			dia = "Quarta-feirea";
			break;
		case 5:
			dia = "Quinta-feira";
			break;
		case 6:
			dia = "Sexta-feira";
			break;
		case 7:
			dia = "Sábado";
			break;
		default:
			dia = "Não faz parte";
			break;
		}
		System.out.println("Dia da semana: " + dia);

		sc.close();

	}
}

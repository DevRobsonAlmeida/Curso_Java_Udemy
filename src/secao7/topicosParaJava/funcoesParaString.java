package secao7.topicosParaJava;

public class funcoesParaString {
	public static void main(String[] args) {
		
		String original = "abcde FGHIJ ABC abc DEFG ";
		
		String letraMinuscula = original.toLowerCase();
		String letraMaiuscula = original.toUpperCase();
		// O trim elimina os espaços em volta da String
		String ajuste = original.trim();
		String pontoDeInicio = original.substring(2);
		String recorte = original.substring(2, 9);
		String substituicaoChar = original.replace('a', 'x');
		String substituicaoString = original.replace("abc", "xy");
		int i =  original.indexOf("bc");
		int j = original.lastIndexOf("bc");
		
		System.out.println("Original - " + original + " -");
		System.out.println("toLowerCase - " + letraMaiuscula + " -");
		System.out.println("toUpperCase - " + letraMinuscula + " -");
		System.out.println("trim: - " + ajuste + " -");
		System.out.println("substring(2): -" +  pontoDeInicio + " -");
		System.out.println("substring(2, 9): - " + recorte + " -");
		System.out.println("replace('a', 'x') - " + substituicaoChar + " -");
		System.out.println("replace(abc, xy) - " + substituicaoString + " -");
		System.out.println("indexOf(bc) - " + i + " -");
		System.out.println("last index of 'bc' - " + j + " -");
		
		System.out.println();
		
		// Operação split
		String s = "potato apple lemon";
		
		String[] vect = s.split(" ");
		System.out.println(vect[0]);
		System.out.println(vect[1]);
		System.out.println(vect[2]);
	}
}

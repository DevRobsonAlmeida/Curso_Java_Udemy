package secao5.estruturaCondicional;

public class ExpressaoCondicionalTernaria {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double preco = 34.5;
		// Expressao condicional ternaria
		double desconto = (preco < 20.0) ? preco * 0.1: preco * 0.05;
		
		System.out.println("O desconto é de " + desconto);

	}

}

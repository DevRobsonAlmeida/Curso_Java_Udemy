package secao5.estruturaCondicional;

public class EscopoEInicializacao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Inicialização
//		Acusa que a variavel precisa de uma valor dentro dele
//		double price;
		double price = 20.0;
		System.out.println(price);
		
		
		
		//Escopo	
		double discount = 0;
		if(price > 10) {
//			double discount = price * 0.1;
			discount = price * 0.1;
		}
		//Se uma varivavel estivcer dentro de uma escopo não inicializada por fora
		//Ele não será reconhecido
		System.out.println(discount);
		
	}

}

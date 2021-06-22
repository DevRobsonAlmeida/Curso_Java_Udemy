package secao4.estruturaSequecial;

public class ProcessandoDados {

	public static void main(String[] args) {
//		Exemplo 1
		int x1, y1;
		
		x1 = 5;
		
		y1 = 2 * x1;

//		System.out.println(y1);
		
		/////////////////////////////////////////////////////////
		
//		Exemplo 2
		int x2;
		double y2;
		
		x2 = 5;
		y2 = 2 * x2;
		
//		System.out.print(y2);
		
		/////////////////////////////////////////////////////////
		
//		Exemplo 3
		
		double h = 5.0, b = 6.0, B = 8.0, area;
		area = ((b+B)/2)*h;
//		System.out.println("Area do Trapezio \n" + area);
		
		/////////////////////////////////////////////////////////
		
//		Exemplo 4
		int a4, b4;
		double resultado;
		
		a4 = 5;
		b4 = 2;
		
		// Método usado no parêntes em chamado de Casting
		// Usado para dar o valor informar que os tipos de valores serão outro
		resultado = (double) a4 / b4;
		
//		System.out.println(resultado);
		
		/////////////////////////////////////////////////////////
		
//		Exemplo 5
		
		double a5;
		int b5;
		
		a5 = 5.0;
//		Usando o Casting, informo que eu só irei quere o inteiro
//		não me importando com as casa decimais
		b5 = (int) a5;
		
//		System.out.println(b5);

	}

}

import java.security.PublicKey;

public class Aplicacao {

	public static void main(String[] args){
//		nesse momento acontece o casting, pois 10 é um valor inteiro e nesse caso estou armazenando um inteiro em uma variável do tipo long
//		tudo que tem dentro de um int cabe dentro de um long
//		atribuindo um valor long a uma variável do tipo long
//		long x = 10L;
		
		
//		tbm esta acontecendo um casting, o java converte esse 35 para double e grava o valor dentro de x
//		double x = 35;
		
//		imprimirá assim: 35.0
//		System.out.println(x);
		
		
//		Aqui estou dizendo que 40.0 agora é uma valor float
//		float x = 40.0F;
		
//		Aqui esrou fazendo um casting explícito
//		float x = (float) 40.0;
		
//		System.out.println(x);
		
//		Nesse caso, não existe casting válido
		short x = (short) 10000000;
		
//		Mudou-se completamente o valor do número; No caso o valor nao cabe dentro da variavel de destino
		System.out.println(x);
		
		
		
		
		
		
		
		
	}

}

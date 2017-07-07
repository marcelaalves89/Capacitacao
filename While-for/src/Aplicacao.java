
public class Aplicacao {

	public static void main(String[] args) {
		
		
//		int x = 0;
////		Primeiro verifica-se a condição, caso a condição seja verdadeira o bloco é executado;
//		while (x < 10){//o bloco while tem a particularidade de ser executado pelo menos uma vez;
//			x++;
//				
//				if (x == 5){
//					continue;// força a execução voltar para o começo do bloco, por isso o número 5 não é impresso!
//				}
//			
//			System.out.println(x);
//		}
	
//		int x = 0;
//		do {//o teste é feito no final!É garantido sempre que pelo menos uma vez o bloco vai ser executado!;Independe da condição;
//			System.out.println(x);
//			x++;
//		} while (x <= 10);
			
//		int i;
//		int j;
//		for (i = 0, j = 10; i < 10; i++, j--) {//condicao e incremento;
//			System.out.println(i+ " " +j);
//
//		}
		for (int i = 0; i < 10; i++) {//a variável i não é vista fora, devido seu escopo!
			System.out.println(i);
		}
	
	}

}

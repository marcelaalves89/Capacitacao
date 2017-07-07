
public class Aplicacao {

	public static void main(String[] args) {
		
//		
//		int num = 10;
		
////		Condição 1
//		if (num > 10){
//			System.out.println("O número é maior do que 10");
////		Condição 2
//		}else if (num < 10){
//			System.out.println("O número é menor que 10");
//		}else {
//			System.out.println("O número é 10");
//		}
//		
		
		int num = 2;
		
		switch (num) {
		case 5:
			System.out.println("O número é 5");
//			determina o final do bloco, parando a execução do mesmo
			break;
		case 10:
			System.out.println("O número é 10");
			break;
		case 15:
			System.out.println("O número é 15");
			break;
		case 6:
			System.out.println("O número é 6");
			break;

		default:
			System.out.println("Não é nenhum dos números");
			break;
		}
		
		
		
		
		
	}

}

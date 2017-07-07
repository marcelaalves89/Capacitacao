
public class Aplicacao {

	public static void main(String[] args) {
		
//		Matematica m = new Matematica();
//		int soma = m.somar(2, 2);
//		int subtrair = m.subtrair(4, 2);
		
//		int soma = Matematica.somar(2, 4);
//		int subtrai = Matematica.subtrair(4, 2);
//		
//		System.out.println(soma);
//		System.out.println(subtrai);
		
		System.out.println(Contador.getValor());
		
		Contador.incrementar();
		Contador.incrementar();
		Contador.incrementar();

		
		System.out.println(Contador.getValor());//Cada um dos objetos tem o seu valor;
//		System.out.println(c2.getValor());
//		System.out.println(c3.getValor());
		
		double media = Constantes.MEDIA;
//		Constantes.MEDIA = 8.0;//Não se pode atribuir um valor a uma constante
		
		System.out.println(media);
	}
}

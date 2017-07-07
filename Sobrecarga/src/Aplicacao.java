
public class Aplicacao {

	public static void main(String[] args) {
		Matematica m = new Matematica();
		//defino numero com ponto, ele é um double;
		double soma = m.somar(10, 20.5);//o java saberá qual método será chamado pelos parametros
		System.out.println(soma);
		
	}

}

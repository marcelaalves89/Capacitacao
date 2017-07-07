
public class Aplicacao {

	public static void main(String[] args) {
		//Tenho um objeto Pessoa no Rip sendo referenciado pelo p1 
		Pessoa p1 = new Pessoa(); //new faz a criação do objeto no Rip/Memória;criando objeto
		p1.nome = "José";//p1 pode acessar os atributos e métodos desse objeto Pessoa
		Pessoa p2 = new Pessoa();
		p2.nome = "Maria";
		
		p1.receber(5);
		p1.receber(7);
		p1.dar(2, p2);//p1 vai dar 2 figurinhas para p2; José deu 2 figurinhas para MAria;
		p2.dar(1, p1);
		
		System.out.println(p1.nome+" => possui "+p1.numFigurinhas+ " figurinhas");
		System.out.println(p2.nome+" => possui "+p2.numFigurinhas+ " figurinhas");

	}

}

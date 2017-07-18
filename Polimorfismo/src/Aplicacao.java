
public class Aplicacao {

	public static void main(String[] args) {
//		Animal a = new Cachorro();//Objeto cachorro criado na memoria,é o que vale!! 
//		
//  	Cachorro c = (Cachorro) a;//Casting Explicito//apenas transformei uma referencia do tipo Animal no tipo Cachorro
//		c.morder();
//		if (a instanceof Cachorro)//a É uma variável que aponta na memória para um objeto do tipo Cachorro? //Evito problemas de incompatibilidade classes no momento da execução do código
//		{
//			Cachorro c = (Cachorro) a;
//			c.morder();
//		}
//	}
		Gato g = new Gato();
		Cachorro c = new Cachorro();
		
		falar(g);
		falar(c);
	}
	//Por ser um método static eu posso chamar ele diretamente
	public static void falar(Animal a){//o metodo animal recebe qualquer anima, gato, cachorro, papagaio, etc
		a.falar();
	}
}

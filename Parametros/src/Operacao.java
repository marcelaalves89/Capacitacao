
public class Operacao {

	void trocar(int n){//o java cria uma variavel n no stack com uma copia do valor passado, no caso 10; Quando se troca um valor de uma variavel dentro de um metodo, esse valor noa é visto fora do método
		n = 20;
	}
	void alterarValor(Valor valor){//Aqui ocorreu uma copia de referencia//Agora tenho duas variaveis apontando para o mesmo objeto na memoria
		valor = new Valor();//peguei a copia da referencia que acabei de criar e fiz ela apontar para outro lugar, para um novo objeto valor que eu criei na memoria;
		valor.v = 20;//Estou indo até o objeto que esta no RIP e trocando o valor do atributo que era 10 para 20, alterei o objeto no RIP, 
	}
}

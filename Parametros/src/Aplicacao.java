
public class Aplicacao {

	public static void main(String[] args) {
	Operacao o = new Operacao();
	
//	int x = 10;//essa variavel é criada no stack
//	o.trocar(x);//o java cria uma cópia do valor no momento da passagem do parametro 
//		
//	
//	System.out.println(x);
	
	Valor valor = new Valor();//valor é uma variavel que referencia uma área de memória
	valor.v = 10;//o objeto recebe valor 10
	
	o.alterarValor(valor);//esse valor continua sendo uma cópia, porém se comporta de forma diferente!    
	
	System.out.println(valor.v);
	
	}

}

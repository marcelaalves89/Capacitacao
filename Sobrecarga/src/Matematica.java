
public class Matematica {
	
	int somar(int x, int y){
		System.out.println("somar(int x, int y)");
		return x+y;//retorno do tipo int
	}
	
	//Métodos com nomes iguais, porém variando os parâmetros, ou até mesmo o retorno;
	//apesar dos metodos terem o mesmo nome, eles possuem assinaturas diferentes;
	int somar(int x, int y, int z){
		System.out.println("somar(int x, int y, int z)");
		return x+y+z;
	}
	double somar(double x, double y){
		System.out.println("somar(double x, double  y)");
		return x+y;
	}
	
}

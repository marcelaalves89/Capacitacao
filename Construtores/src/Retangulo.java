
public class Retangulo {

	private double largura;
	private double altura;
	
	public Retangulo(){//Construtor
		this(4,3);
//		largura = 4;
//		altura = 3;
	}
	public Retangulo (double altura, double largura){//sobrecarga de construtores; 
		this.altura = altura;
		this.largura = largura;
	}
	
	public double calcularArea(){
		return largura * altura;
	}

}

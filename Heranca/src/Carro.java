
public class Carro extends Veiculo{
	
	public void buzinar(){
		System.out.println("PII PIIII");
	}
	
	public boolean quatroPortas;

	public boolean isQuatroPortas() {
		return quatroPortas;
	}

	public void setQuatroPortas(boolean quatroPortas) {
		this.quatroPortas = quatroPortas;
	}
	
	public void imprimirDados(){
		super.imprimirDados();
//		System.out.println("Marca: "+ getMarca());//Como os atributos da superClasse veículo sào privados então a classe Carro só terá acesso a ela, por meio do método get
//		System.out.println("Modelo: "+ getModelo());
//		System.out.println("Ano: "+ getAno());
		System.out.println("Quatro Portas: " + quatroPortas);
	}

}

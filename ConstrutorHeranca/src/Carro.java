
public class Carro extends Veiculo{ // a Classe Carro nao define nehum construtor
	public Carro(String marca){//Na hora de criar o carro, quero dizer qual é a marca
//		super();
//		super("Ferrari");//invocar o construtor ixplecitamente;
		super(marca);//chama construtor de veiculo e passa a marca que o carro recebeu para veículo
		System.out.println("Carro(String)" +marca);
	}

}

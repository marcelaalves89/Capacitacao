
public class Veiculo {
	protected String marca;
	
//	public Veiculo(){
////		super(); //chama o construtor da classe acima que não recebe parametro
//		System.out.println("Veiculo()");
//	}

	public Veiculo(String marca){
		this.marca = marca;
		System.out.println("Veiculo(String)" +marca);
	}
}

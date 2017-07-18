
public class Refrigerante extends Bebida{

	public Refrigerante (){
		super("Refrigerante" , false);
	}

	@Override
	public void preparar() {
		System.out.println("Pega o copo de vidro");
		System.out.println("Coloca o Refrigerante no copo");
	}
}

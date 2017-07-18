
public class Aplicacao {

	public static void main(String[] args) {
		
		
		LeiteQuente leite = new LeiteQuente();
		Refrigerante refri = new Refrigerante();
		Preparador preparador = new Preparador();
		
		//preparador.prepararBebida(leite);
		preparador.prepararBebida(refri);
		
	}

}

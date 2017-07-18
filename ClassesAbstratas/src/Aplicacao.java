
public class Aplicacao {
	
	public static void main(String[] args) {
		diamante d = new diamante();
		d.pegar();
		
		cogumelo c = new cogumelo();
		c.pegar();
		
		moeda m = new moeda();
		m.pegar();
	
		Item maca = new maca(); //Aplcia-se um casting Explicito
		maca.pegar();
		
		
	}
	

}

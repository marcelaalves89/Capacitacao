
public class Aplicacao {

	public static void main(String[] args){
		System.out.println("Carro");
		Carro c = new Carro();
		c.setMarca("HB20");
		c.setModelo("Hetz");
		c.setAno(2013);
		c.setQuatroPortas(true);
		c.imprimirDados();
		//c.buzinar();
		
		System.out.println("Motocicleta");
		Motocicleta m = new Motocicleta();
		m.setMarca("Honda");
		m.setModelo("Titan");
		m.setAno(2016);
		m.buzinar();
		m.imprimirDados();
		//m.empinar();
		
		//Caminhao cam = new Caminhao();
		//m.buzinar();

	}
}

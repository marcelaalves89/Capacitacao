
public class Aplicacao {

	public static void main(String[] args) {
		Retangulo r1 = new Retangulo();//construa um objeto Retangulo na memória e invoque um construtor que nao chame parametro;
		double area1 = r1.calcularArea();
		
		System.out.println(area1);
		
		Retangulo r2 = new Retangulo(5,7);//Passa os parametros no momento de se instanciar o objeto;
		double area2 = r2.calcularArea();
		
		System.out.println(area2);
		
		Quadrado q1 = new Quadrado(5);
		
		System.out.println(q1.calcularArea());
		
		
	}

}

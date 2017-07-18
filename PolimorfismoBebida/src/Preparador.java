
public class Preparador {

	public void prepararBebida(Bebida bebida){//O preparador não sabe que bebida ele estar recebendo
		System.out.println("Preparando a Bebida: " +bebida.getNome());
		bebida.preparar();
		
		if(bebida.isAquecer()){
			System.out.println("Aquecendo a Bebida: " +bebida.getNome());
		}
		
		System.out.println("Bebida preparada com SUCESSO!!!");
		
	}
	

}

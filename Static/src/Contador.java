
public class Contador {

	private static int valor;

	static{
		valor = 1;	
	}
	
	public static void incrementar(){//definir método como static
		valor++;
	}
	public static int getValor() {//definir método como static
		return valor;
	}
	
	

}

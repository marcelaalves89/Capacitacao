
public class Aplicacao {

	public static void main(String[] args) {
		
		ContaBancaria c = new ContaBancaria();
		
		c.setNumConta(54334);
		c.setAtiva(true);
		c.depositar(50);
		c.sacar(20); //Não se pode manipular diretamente, pensar em encapsulamentooo;
		
		double saldo = c.getSaldo();
		
		System.out.println("Depositei: "+c.getSaldo()+" Agora meu saldo é: "+saldo);
	}
}

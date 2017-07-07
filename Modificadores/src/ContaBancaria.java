
public class ContaBancaria {

	private int numConta;
	private boolean ativa;
	private double saldo;//define a visibilidade por meio do private//Basicamente se esconde algo//Via de regra use o private
	
	public void sacar(double valor){
		if (valor<=saldo){
			return;
		}
		
		saldo-=valor;
	}
	public void depositar(double valor){
		if (valor < 0){
			return;//Executa o método e nao executa o que esta dali pra baixo/
		}
		saldo+=valor; 
	}
	
	
	public int getNumConta() {
		return numConta;
	}
	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}
	public boolean isAtiva() {
		return ativa;
	}
	public void setAtiva(boolean ativa) {
		this.ativa = ativa;
	}
	public double getSaldo() {
		return saldo;
	}
//	public void setSaldo(double saldo) {
//		this.saldo = saldo;
//	}
	
	

}

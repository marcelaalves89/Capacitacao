
public class Pessoa {

	String nome;
	int numFigurinhas;//a pessoa já tem X número de figurinhas;
	
	//a pessoa esta recebendo X numero de figurinhas do método receber;
	void receber(int numFigurinhas){//Quantidade de figurinhas que será recebida de alguém
		//o this não permite ambiguidade, uma vez que temos duas variáveis com o mesmo nome; Diferenciado-as;
		this.numFigurinhas += numFigurinhas;
	}
	//tenho como parâmetro o numero de figurinhas que vai ser cedido e pra quem vai ser cedido;
	void dar(int numFigurinhas, Pessoa p){//Quantidade de figurinhas que será dada a alguém 
		this.numFigurinhas -= numFigurinhas;
		//p.numFigurinhas += numFigurinhas;
		p.receber(numFigurinhas);//p esta recebendo X figurinhas
	}

}

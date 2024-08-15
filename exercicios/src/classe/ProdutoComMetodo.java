package classe;

public class ProdutoComMetodo {
	
	String nome;
	double preco;
	double desconto;
	
	double precoComdesconto(){
		return preco * (1 - desconto);
	}

	double precoComdesconto(double descontoDoGerente){
		return preco * (1 - descontoDoGerente);
	}

}

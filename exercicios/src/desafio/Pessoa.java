package desafio;

public class Pessoa {
	String nome;
	double peso;
	
	public Pessoa(String nome, double peso) {
		this.nome = nome;
		this.peso = peso;
	}
	
	void comer(Comida comida) {
		if (comida != null) {
			this.peso += comida.peso;
		}	
			
	}
	
	String apresentar() {
		return "Ola eu sou "+ this.nome + " e tenho "+this.peso;
	}
}

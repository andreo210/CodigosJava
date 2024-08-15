package oo.herança;

public class Carro {
	
	public int velocidadeAtual;
	protected final int VELOCIDADEMAXIMA;
	private  int delta = 5;
	
	public int getDelta() {
		return delta;
	}

	public void setDelta(int delta) {
		this.delta = delta;
	}

	protected Carro(int VelocidadeMaxima) {
		VELOCIDADEMAXIMA = VelocidadeMaxima;
	}
	
	void acelerar () {
		if (velocidadeAtual + getDelta() > VELOCIDADEMAXIMA) {
			velocidadeAtual = VELOCIDADEMAXIMA;
		}else {
			velocidadeAtual+=getDelta();
		}
	}
	
	void frear() {
		if (velocidadeAtual >= 5) {
			velocidadeAtual -= 5;
		}else {
			velocidadeAtual =0;
		}
	}
	
	public String toString() {
		return "Velocidade atual eh "+ velocidadeAtual;
	}

}

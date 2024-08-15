package oo.herança;

public class Ferrari extends Carro implements Esportivo, Luxo{
	
	private boolean ligarTurbo;
	private boolean ligarAR;
	
	public Ferrari() {
		this(315);
	}
	public Ferrari(int velocidadeMaxima){
		super(velocidadeMaxima);
		setDelta(15);
	}
	@Override
	public void ligarTurbo() {
		ligarTurbo = true;
		
	}
	@Override
	public void desligarTurbo() {
		
		ligarTurbo = false;
		}
	@Override
	public void ligarAr() {
		ligarAR = true;
		
	}
	@Override
	public void desligarAr() {
		
		ligarAR = false;
	}
	@Override
	public int getDelta() {
		if (ligarTurbo&& ! ligarAR) {
			 return 35;
		}else if(ligarTurbo&&  ligarAR) {
			return 30;
		}else if (! ligarTurbo&& ! ligarAR) {
			return 20;
		}else {
			return 15;
		}
		
	}
	
	
//	void acelerar() {
//		velocidadeAtual += 15;
//	}
}

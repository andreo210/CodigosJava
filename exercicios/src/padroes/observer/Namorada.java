package padroes.observer;

public class Namorada implements ObservadorChegadaAniversariante{

	
	public void chegou(EventoChegadaAniversariante evento) {
		System.out.println("avisa os convidados .....");
		System.out.println("apagar as luzes .....");
		System.out.println("espera um pouco .....");
		System.out.println("e ...supresa .....");
		
	}
	
	
}

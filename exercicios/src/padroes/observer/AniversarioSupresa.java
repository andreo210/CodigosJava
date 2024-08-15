package padroes.observer;

public class AniversarioSupresa {

	public static void main(String[] args) {
		Porteiro porteiro = new Porteiro();
		Namorada namorada = new Namorada();
		
		porteiro.registrarObservador(namorada);
		
		porteiro.registrarObservador(e -> {
			System.out.println("Supresa via lambda");
		});
		
		porteiro.monitorar();
		

		
		
	}

}

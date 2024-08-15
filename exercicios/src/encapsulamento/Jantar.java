package encapsulamento;

public class Jantar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pessoa convidado = new Pessoa(80);
		Arroz comida1 = new Arroz(0.5);
		Feijao comida2 = new Feijao(0.10);
		
		System.out.println(convidado.getPeso());
		
		convidado.comer(comida2);
		convidado.comer(comida1);
		System.out.println(convidado.getPeso());
		
		Sorvete comida3 = new Sorvete(0.8);
		
		convidado.comer(comida3);
		System.out.println(convidado.getPeso());
	
		
		
	}

}

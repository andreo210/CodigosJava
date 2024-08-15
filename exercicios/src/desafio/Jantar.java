package desafio;

public class Jantar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Comida c1 = new Comida("Arroz", 0.223);
		Comida c2 = new Comida("Feijão", 0.300);
		
		Pessoa p = new Pessoa("andre", 99.9);
		p.comer(c1);
		p.comer(c2);
		
		System.out.println(p.apresentar());
	}

}

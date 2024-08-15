package generics;

public class CaixaTEST {

	public static void main(String[] args) {
		Caixa<Double> caixaA = new Caixa();
		caixaA.guardar(2.3);
		Double coisaA = (Double) caixaA.abrir();
		System.out.println(coisaA);
		
		Caixa<String> caixaB = new Caixa();
		caixaB.guardar("teste");
		String coisaB = (String) caixaB.abrir();
		System.out.println(coisaB);

	}

}

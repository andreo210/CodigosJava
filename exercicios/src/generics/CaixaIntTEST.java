package generics;

public class CaixaIntTEST {

	public static void main(String[] args) {
		
		CaixaInt caixaA = new CaixaInt();
		caixaA.guardar(2);
		Integer coisaA = (Integer) caixaA.abrir();
		System.out.println(coisaA);

	}

}

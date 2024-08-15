package generics;

public class CaixaObjectTEST {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CaixaObjeto caixaA = new CaixaObjeto();
		caixaA.guardar(2.3);
		Double coisaA = (Double) caixaA.abrir();
		System.out.println(coisaA);
		
		CaixaObjeto caixaB = new CaixaObjeto();
		caixaB.guardar("teste");
		String coisaB = (String) caixaB.abrir();
		System.out.println(coisaB);

	}

}

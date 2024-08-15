package encapsulamento.casaA;

public class Paulo  extends Ana{
	
	Ana esposa = new Ana();
	
	void testeAcesso(){
		//System.out.println(esposa.segredo);//private
		System.out.println(esposa.facodentroDeCasa);
		System.out.println(esposa.formaDeFalar);
		System.out.println(esposa.todosSabem);		
		
	}
}

package encapsulamento.casaB;

import encapsulamento.casaA.Ana;

public class Pedro extends Ana{

	Ana sogra = new Ana();
	
	void testeAcesso(){
		//System.out.println(esposa.segredo);//private
		//System.out.println(sogra.facodentroDeCasa);//só dentro do mesmo pacote
		System.out.println(formaDeFalar);//herança não pode ser instaciado
		System.out.println(sogra.todosSabem);		
		
	}

}

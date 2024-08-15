package encapsulamento.casaB;

import encapsulamento.casaA.Ana;

public class Julia extends Ana {
	
	Ana tia = new Ana();
	
	void testeAcesso(){
		//System.out.println(esposa.segredo);//private
		//System.out.println(tia.facodentroDeCasa);//so no mesmo pacote
		System.out.println(formaDeFalar);//herança
		System.out.println(tia.todosSabem);		//publico
		
	}

}

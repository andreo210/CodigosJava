package controle;

public class SwitchSemBreak {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String faixa = "marrom";
		
		switch (faixa.toLowerCase()){
		case "preta": {
			
			System.out.println("Sei o Bassai-Dai....");
		}
		case "marrom": {
			
			System.out.println("Sei o Tekki Shodan....");
		}
		case "roxa": {
			
			System.out.println("Sei o Heian Godan....");
		}
		default:
			System.out.println("nao sei nada");
		}
		System.out.println("Fim");

	}

}

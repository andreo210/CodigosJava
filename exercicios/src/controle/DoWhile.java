package controle;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);
		
		String texto = "por favor";
		do {
			System.out.println("Voce precisa falar "+ "\nas palavras magicas....");
			System.out.println("Quer sair ? ");
			texto = entrada.nextLine();
			
		}while (!texto.equalsIgnoreCase("por favor")) ;
			   System.out.println("obrigado ");
			   entrada.close();
		

	}

}

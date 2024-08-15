package controle;

import java.util.Scanner;

public class IF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("informe a média  ");
		double media = entrada.nextDouble();
		
		if (media <= 10 && media >= 7.0) {
			
			System.out.println("Aprovado");
			System.out.println("Parabéns !!!");
		}
		if (media <7 && media >= 4.56) {
			System.out.println("recuperação");				
			
		}
		boolean criterioReprovacao = media < 4.5 && media >= 0;
		
		if (criterioReprovacao) {
					System.out.println("reprovado");
		}
		
		entrada.close();

	}

}

package fundamentos;

import java.util.Scanner;

public class Console {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//imprimi na mesma linha
		System.out.print("bom dia ");
		System.out.print(", oi ");
		
		//imprimi em outra linha
		System.out.println("bom dia e outa linha");
		
		//imprimi formatado
		System.out.printf("Magasena  %d %d %d %d %d %d", 2, 43, 55, 32, 1, 60);
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("digite seu nome");
		entrada.nextLine();
		
		System.out.print(entrada);
	}

}

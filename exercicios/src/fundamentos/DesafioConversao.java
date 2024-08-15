package fundamentos;

import java.util.Scanner;

public class DesafioConversao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe o primeiro salario");
		String valor1 = entrada.next().replace("," , ".");
		
		System.out.print("\n Informe o segundo salario");
		String valor2 = entrada.next().replace("," , ".");
		
		System.out.print("\n Informe o terceiro salario");
		String valor3 = entrada.next().replace("," , ".");
		
		Double salario1 = Double.parseDouble(valor1);
		Double salario2 = Double.parseDouble(valor2);
		Double salario3 = Double.parseDouble(valor3);
		
		Double media = (salario1+salario2+salario3)/3;
		System.out.println("a media de salario é :" +media);
		entrada.close();

	}

}

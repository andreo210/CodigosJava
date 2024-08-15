package controle;

import java.util.Scanner;

public class DesafioWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
		int quantidadeDeNotas = 0;
		double nota = 0;
		double total = 0;
		
		while(nota != -1) {
			System.out.println("informe a nota (ou -1 p /sair )");
			nota = entrada.nextDouble();
			
			if (nota <= 10 && nota >= 0) {
				total += nota;
				quantidadeDeNotas ++;
			}else {
				System.out.println("nota invalida  !!!!; D");
			}		
		}
		
		//calcular média
		double media = total/quantidadeDeNotas;
		System.out.println("media = " +media);
		
		entrada.close();

	}

}

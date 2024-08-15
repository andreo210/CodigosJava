package arrays;

import java.util.Scanner;

public class DesafioArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("quantas notas: ");
		int qtdeNotas = entrada.nextInt();
		double[] notas = new double[qtdeNotas];
		
		for (int i = 0; i < notas.length; i++) {
			System.out.println("informe a nota:"+ (i +1) + ": ");
			notas [i]= entrada.nextDouble();
		}
		
		double total = 0;
		for (double d : notas) {
			total += d;
		}
		
		double media = total/notas.length;
		System.out.println("a média é " +media + "!!!");
		entrada.close();
	}

}

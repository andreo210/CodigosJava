package fundamentos;

import javax.swing.JOptionPane;

public class ConversaoStringNumero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String valor1 = JOptionPane.showInputDialog("Digite um numero :");
		String valor2 = JOptionPane.showInputDialog("Digite outro numero :");
		
		double numero1 = Double.parseDouble(valor1);
		double numero2 = Double.parseDouble(valor2);
		
		double soma = numero1+ numero2;
		System.out.println("Soma é" +soma);
		System.out.println("Média é "+soma/2);

	}

}

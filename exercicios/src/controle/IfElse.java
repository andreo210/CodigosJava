package controle;

import javax.swing.JOptionPane;

public class IfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String valor = JOptionPane.showInputDialog("informe o numero ");
		
		int num  = Integer.parseInt(valor);
		
		if (num % 2 == 0) {
			
			System.out.println("numero par");
			
		} else {
			
			System.out.println("numero impar");

		}

	}

}

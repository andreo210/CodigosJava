package br.com.coder.app_financeiro;

import br.com.coder.app.calculo.Calculadora;
import br.com.coder.app.calculo.interno.OperacoesAritmeticas;

public class TESTE {

	public static void main(String[] args) {
		
		Calculadora calc = new Calculadora();
		System.out.println(calc.soma(2,3,6));
		
		OperacoesAritmeticas op = new OperacoesAritmeticas();
		
		System.out.println(op.soma(3,6,9));

	}

}

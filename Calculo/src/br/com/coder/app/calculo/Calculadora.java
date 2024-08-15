package br.com.coder.app.calculo;

import java.lang.System.Logger;

import br.com.coder.app.calculo.interno.OperacoesAritmeticas;

public class Calculadora {
	private OperacoesAritmeticas operacoe = new OperacoesAritmeticas();

	public double soma(double... nums) {
		return operacoe.soma(nums);
	}
	
}

package br.com.coder.calc.visao;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class Calculadora extends JFrame{

	public Calculadora() {
		organizarLayout();
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);//padrão para sair
		setVisible(true);//visivel
		setLocationRelativeTo(null);//centralixar na tela
		setSize(350,500); //tamanho
		
	}

	private void organizarLayout() {
		
		setLayout(new BorderLayout());
		
		Display display = new Display();
		display.setPreferredSize(new Dimension(233, 80));
		add(display, BorderLayout.NORTH);
		
		Teclado teclado = new Teclado();
		add(teclado, BorderLayout.CENTER);
	}

	public static void main(String[] args) {
		
		new Calculadora();
	}

}

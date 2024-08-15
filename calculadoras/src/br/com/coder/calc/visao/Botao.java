package br.com.coder.calc.visao;

import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JButton;

public class Botao  extends JButton{

	public Botao(String texto, Color cor) {
		
		setText(texto);//texto
		setOpaque(true);
		setBackground(cor);//cor do fundo
		setForeground(Color.white);//cor da fonte
		setFont(new Font("courier",Font.PLAIN, 25));//font;
		setBorder(BorderFactory.createLineBorder(Color.black));
	}
} 
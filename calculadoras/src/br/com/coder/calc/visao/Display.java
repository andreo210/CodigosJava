package br.com.coder.calc.visao;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Label;

import javax.swing.JLabel;
import javax.swing.JPanel;

import br.com.coder.calc.modelo.Memoria;
import br.com.coder.calc.modelo.MemoriaObservador;

@SuppressWarnings("serial")
public class Display extends JPanel implements MemoriaObservador{
	
	private final JLabel label ;

	public Display() {
		Memoria.getInstancia().adicionarObservador(this);
		
		setBackground(new Color(46,49,50));//cor do fundo do display
		label = new JLabel(Memoria.getInstancia().getTextoAtual());//label da font
		label.setForeground(Color.white);//cor da font
		label.setFont(new Font("courier",Font.PLAIN, 30));//font
		
		setLayout(new FlowLayout(FlowLayout.RIGHT,10,25));//alinhamento 
		add(label);
	}

	@Override
	public void valorAlterado(String novoValor) {
		label.setText(novoValor);
		
	}

}

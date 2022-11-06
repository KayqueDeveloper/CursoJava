package br.com.cod3r.calc.visao;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;

import br.com.cod3r.calc.modelo.Memoria;
import br.com.cod3r.calc.modelo.MemoriaObserver;

public class Display extends JPanel implements MemoriaObserver {
	
	private final JLabel label;

	public Display() {
		Memoria.getInstancia().adicionarObserver(this);
		
		setBackground(new Color(46, 49, 50));
		label  = new JLabel(Memoria.getInstancia().getTextoAtual());
		label.setForeground(Color.WHITE);
		label.setFont(new Font("courier", Font.PLAIN, 30));
		
		setLayout(new FlowLayout(FlowLayout.RIGHT, 10, 20));
		
		add(label);
	}
	
	@Override
	public void valorAlterado(String novoValor) {
		label.setText(novoValor);
		
	}
	
}

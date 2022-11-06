package br.com.cod3er.cm.visao;

import javax.swing.JFrame;

import br.com.cod3er.cm.modelo.Tabuleiro;

public class TelaPrincipal extends JFrame {

	public TelaPrincipal() {
		Tabuleiro tabuleiro = new Tabuleiro(16, 30, 50);
		PainelTabuleiro painelTabuleiro = new PainelTabuleiro(tabuleiro);
		
		add(painelTabuleiro);
		
		setTitle("Campo Minado");
		setSize(695, 440);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setVisible(true);
		
	
	}
	
	public static void main(String[] args) {
		
		new TelaPrincipal();
		
	}
}

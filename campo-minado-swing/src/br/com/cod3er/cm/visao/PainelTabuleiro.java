package br.com.cod3er.cm.visao;

import java.awt.GridLayout;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

import br.com.cod3er.cm.modelo.Tabuleiro;

public class PainelTabuleiro extends JPanel{

	public PainelTabuleiro(Tabuleiro tabuleiro) {
		setLayout(new GridLayout(tabuleiro.getLinhas(), tabuleiro.getColunas()));
		
		tabuleiro.paraCada(c -> add(new BotaoCampo(c)));
		
		tabuleiro.registarObservador(c -> {
			
			SwingUtilities.invokeLater(() -> {
				
				if(tabuleiro.objetivoAlcancado()) {
					JOptionPane.showMessageDialog(this, "Você Ganhou!");
				}else {
					JOptionPane.showMessageDialog(this, "Você Perdeu!");
				}
				
				tabuleiro.reiniciar();
			});
		});
		
	}
	
}

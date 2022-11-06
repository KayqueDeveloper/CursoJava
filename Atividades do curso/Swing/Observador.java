package Swing;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Observador {

	public static void main(String[] args) {
		
		JFrame janela = new JFrame("Observador");
		janela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		janela.setSize(600, 600);
		janela.setLayout(new FlowLayout());
		janela.setLocationRelativeTo(null);// null = centralizar na tela do computador
		
		
		JButton botao = new JButton("Clicar");
		JButton botao2 = new JButton("Clicar 2");
		janela.add(botao);
		janela.add(botao2);
		
		botao.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {

				System.out.println("Evento ocorreu");
			}
		});
		
		botao2.addActionListener(e -> {
			System.out.println("Evento ocorreu 2");
		});
		
		janela.addFocusListener(new FocusListener() {
			
			public void focusLost(FocusEvent e) {
				
			}
			
			public void focusGained(FocusEvent e) {
				
			}
		});
		
		janela.setVisible(true);
		
	}
}

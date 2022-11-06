package desafios;

import javax.swing.JOptionPane;

public class TemperaturaF {
	public static void main(String[] args) {
		
		var F = JOptionPane.showInputDialog("Informe a Temperatura em Fahrenheit:");
		double Tempf = Double.parseDouble(F);
		
		double operação = (Tempf - 32) / 1.8;
		
		System.out.printf("A temperatura em Graus °C e: %.1f", operação);
		
		
	}

}

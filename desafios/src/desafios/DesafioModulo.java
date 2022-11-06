package desafios;

import javax.swing.JOptionPane;

public class DesafioModulo {
	public static void main(String[] args) {

		var valor1 = JOptionPane.showInputDialog("Digite o primeiro numero:");
		var valor2 = JOptionPane.showInputDialog("Digite outro número:");
		var operador = JOptionPane.showInputDialog("Digite uma operação entre +, -, *, /, %:");
		
		double num1 = Double.parseDouble(valor1.trim());
		double num2 = Double.parseDouble(valor2.trim());
						
		double ResultadoOperador1 = num1 + num2;
		double ResultadoOperador2 = num1 - num2;
		double ResultadoOperador3 = num1 * num2;
		double ResultadoOperador4 = num1 / num2;
		double ResultadoOperador5 = num1 % num2;
		
		String resultado = 
			operador.trim().equals("+") ? "" + ResultadoOperador1 :
			operador.trim().equals("-") ? "" + ResultadoOperador2 :
			operador.trim().equals("*") ? "" + ResultadoOperador3 :
			operador.trim().equals("/") ? "" + ResultadoOperador4 :
			operador.trim().equals("%") ? "" + ResultadoOperador5 :	
			"OPERACAO INVALIDA";
		
		System.out.printf("%.2f %s %.2f = " + resultado, num1, operador, num2);
		
		 

	}

}

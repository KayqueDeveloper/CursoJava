package fundamentos;

import javax.swing.JOptionPane;

public class ConversaoStringNumero {
	public static void main(String[] args) {
		String v1 = JOptionPane.showInputDialog("Digite um número:");
		String v2 = JOptionPane.showInputDialog("Digite outro número:");
		
		System.out.println(v1  + v2);
		
		double num1 = Double.parseDouble(v1);		
		double num2 = Double.parseDouble(v2);
		double soma = num1 + num2;
		
		System.out.println("a soma dos numeros é: " + soma);
		System.out.println("A média dos dois numeros é: " + soma / 2);
		  
		
	}

}

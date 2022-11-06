package desafios;

import java.util.Scanner;

public class TemperaturaC {
	public static void main(String[] args) {
		Scanner Void = new Scanner(System.in);
		
		System.out.println("Digite o valor em °C: ");
		double temp = Void.nextDouble();
		double resultado = temp * 1.8 + 32;
		
		System.out.printf("%.1f °C equivale a: %.1f °F", temp, resultado);
		
		
		Void.close();
		
	}

}

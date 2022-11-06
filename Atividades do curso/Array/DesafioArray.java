package Array;

import java.util.Scanner;

public class DesafioArray {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int quantidade_notas;

		System.out.print("digite a quantidade de notas a ser informada: ");
		quantidade_notas = entrada.nextInt();
		
		double Notas[] = new double[quantidade_notas];
		
		for(int i = 0; i < quantidade_notas; i++) {
			System.out.print("Digite a nota " + (i + 1) +": ");
			Notas[i] = entrada.nextDouble();
		}
		
		double media = 0;
		for (double soma : Notas){
			media += soma;
		}
		media = media / quantidade_notas;
		System.out.printf("A media desse aluno e %.1f", media);
		System.out.println("testando");
		
		
		entrada.close();
		
	}

}

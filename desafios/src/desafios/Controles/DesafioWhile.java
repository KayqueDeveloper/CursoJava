package desafios.Controles;

import java.util.Scanner;

public class DesafioWhile {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		double nota = 0;
		int contador = 0;
		double total = 0;

		while (!(nota == -1)) {
			System.out.print("Digite a nota: ");
			nota = entrada.nextDouble();
			if (nota >= 0 && nota <= 10) {
				contador++;
				total = total + nota;
			} else if (nota != -1) {
				System.out.println("Nota Invalida, Tente outra.");
			}
		}

		double media = total / contador;
		System.out.printf("Com o total de %d alunos, a media da sala foi de %.2f pts", contador, media);

		entrada.close();

	}

}

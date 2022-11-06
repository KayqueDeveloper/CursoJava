package fundamentos;

import java.util.Scanner;

public class AulaConsole {
	public static void main(String[] args) {
		//System.out.print("bom");
		//System.out.print("dia ");
		
		//System.out.println("Bom");
	//System.out.println("dia!");
		
		//System.out.printf("Megasena: %d %d %d %d %d %d %d", 1, 2, 3, 4, 5, 6);
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("digite seu nome: ");
		String nome = entrada.nextLine();
		System.out.print("Digite seu sobrenome: ");
		String sobrenome = entrada.nextLine();
		System.out.print("Digite sua idade: ");
		int idade = entrada.nextInt();
		
		System.out.printf("%s %s tem %d anos.%n",
				nome, sobrenome,  idade);
		
		entrada.close();
		
	}

}

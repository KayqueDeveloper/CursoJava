package controle;

import java.util.Scanner;

public class WhileInderteminado {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		
		String algo = "";
		
		while (!algo.equalsIgnoreCase("sair")) {
			System.out.print("Digite algo (digite 'sair' para sair) :");
			algo = entrada.nextLine();
		}
		
		
		entrada.close();
		
	}
}

package desafios;

import java.util.Scanner;

public class DesafioScanner {
	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		
		System.out.print("Digite o sálario ddo joão no mês 3: ");
		String s1 = ent.nextLine().replace(",", ".");
		//s1 = s1.replace(",", ".");
		System.out.print("Digite o sálario ddo joão no mês 4: ");
		String s2 = ent.nextLine().replace(",", ".");
		//s2 = s2.replace(",", ".");
		System.out.print("Digite o sálario ddo joão no mês 5: ");
		String s3 = ent.nextLine().replace(",", ".");
		//s3 = s3.replace(",", ".");
		
		double m1 = Double.parseDouble(s1);
		double m2 = Double.parseDouble(s2);
		double m3 = Double.parseDouble(s3);
		double soma = m1 + m2 + m3;
		double media = soma / 3;
		
		System.out.printf
		("O sálario de João \nNo mes 3 foi: %.2f\nNo mes 4 foi: %.2f\nNo mes 5 foi: %.2f\n"
				+ "Totalizando um total de: %.2f\n com uma media de: %.2f por mes", 
				m1, m2, m3, soma, media);
		
	    
		
		ent.close();
	}

}

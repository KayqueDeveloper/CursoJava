package Lambdas;

import java.util.Arrays;
import java.util.List;

public class Foreach {
	
	public static void main(String[] args) {
		
		List<String> aprovados = Arrays.asList("Ana", "Bia", "lia", "Gui");
		
		System.out.println("Forma Tradicional! ");
		for (String nome : aprovados) {
			System.out.println(nome);
		}
		
		System.out.println("\nLambdas #01");
		aprovados.forEach( (nome) -> { System.out.println(nome); } );
//		aprovados.forEach( nome -> System.out.println(nome));  tambem pode pq e apenas um parametro e expressao.
		
		System.out.println("\nMethod Reference #01");
		aprovados.forEach(System.out::println);
		
		System.out.println("\nLambdas #02");
		aprovados.forEach(nome ->MeuImprimir(nome));

		System.out.println("\nMethod Reference #02");
		aprovados.forEach(Foreach::MeuImprimir);
		
	}

	
	static void MeuImprimir(String nome) {
		System.out.println("Oi Meu nome e : " + nome);
	}
}


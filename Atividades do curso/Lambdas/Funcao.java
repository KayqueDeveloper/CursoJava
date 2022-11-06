package Lambdas;

import java.util.function.Function;

public class Funcao {
	
	public static void main(String[] args) {
		
		Function<Integer, String> Par_ou_Impar = num -> num % 2 == 0 ? "Par" : "Impar";
				
		Function<String, String> oResultado = valor -> "O resultado e " + valor;
		
		Function<String, String> empolgado = valor -> valor + "!!!";
		
		Function<String, String> duvida = valor -> valor + "??";
		
		String resultado = Par_ou_Impar
				.andThen(oResultado)
				.andThen(empolgado)
				.apply(32);
		
		String resultado2 = Par_ou_Impar
				.andThen(oResultado)
				.andThen(duvida)
				.apply(33);

		System.out.println(resultado);
		System.out.println(resultado2);
		System.out.println(Par_ou_Impar.apply(32));
		
		
		
	}

}

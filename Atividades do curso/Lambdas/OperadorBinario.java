package Lambdas;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;

public class OperadorBinario {
	
	public static void main(String[] args) {
		
		BinaryOperator<Double> media = (n1, n2) -> (n1 + n2) / 2;
		System.out.println(media.apply(9.8, 5.7));
		
		Function<Double, String> conceito = m -> m >= 7 ? "Aprovado" : "Reprovado";
		System.out.println(media.andThen(conceito).apply(9.7, 5.1));
		
		
		BiFunction<Double, Double, String> resultado = (n1, n2)  -> {   /*tambem pode usar chaves nas lambdas*/
			double notafinal = (n1 + n2) / 2;
			return notafinal >= 7 ? "Aprovado" : "Reprovado";
		};
				
		System.out.println(resultado.apply(9.7, 4.1));		
		
		
		
	}

}

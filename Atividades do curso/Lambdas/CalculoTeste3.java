package Lambdas;

import java.util.function.BinaryOperator;

public class CalculoTeste3 {
	
	public static void main(String[] args) {
		
		// Não: int -> Double
		// double -> Double
		
		BinaryOperator<Double> soma = (x, y) -> { return x + y; };
		
		System.out.println(soma.apply(2.0, 3.0));
		
		Calculo multi = (x, y) -> x * y;
		System.out.println(multi.executar(2, 3));
		
	}

}

package Lambdas;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.function.BinaryOperator;
import java.util.function.Function;

public class Desafio {

	public static void main(String[] args) {
		
		Locale localeBR = new Locale("pt", "BR");
		Produto p = new Produto("Ipad", 3235.89, 0.13);
	
		BinaryOperator<Double> precoDesc = (preco, desconto)  -> (1 - desconto) * preco;
		Function<Double, Double> Imposto = preco -> preco >= 2500 ? preco * 0.915 : preco * 1;
		Function<Double, Double> frete = preco -> preco >= 3000 ? preco + 100 : preco + 50;
		
		double precoFinal = precoDesc
				.andThen(Imposto)
				.andThen(frete)
				.apply(p.preco, p.desconto);
		
		NumberFormat precoFormat = NumberFormat.getCurrencyInstance(localeBR);
		
		System.out.println("O preco final do produto e : " + precoFormat.format(precoFinal));
	}
}

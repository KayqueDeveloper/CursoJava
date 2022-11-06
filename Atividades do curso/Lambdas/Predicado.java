package Lambdas;

import java.util.function.Predicate;

public class Predicado {
	
	public static void main(String[] args) {
		
		
		Predicate<Produto> isCaro = prod -> (prod.preco * (1 - prod.desconto)) >= 750; //retorna um valor verdadeiro ou falso
		
		Produto produto = new Produto("notebook", 3893.89, 0.15);
		System.out.println(isCaro.test(produto));
	}

}

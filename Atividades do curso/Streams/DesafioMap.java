package Streams; 

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class DesafioMap {

	public static void main(String[] args) {
		
		List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
		
		Consumer<String> print = System.out::print;
		Function<Integer, String> convBinario = n -> Integer.toBinaryString(n) + "";
		UnaryOperator<String> invString = s -> new StringBuilder(s).reverse().toString();
		Function<String, Integer> passarParaBinario = n -> Integer.parseInt(n, 2);
		Function<Integer, String> toString = n -> n.toString() + " "; 
		
		nums.stream()
			.map(convBinario)
			.map(invString)
			.map(passarParaBinario)
			.map(toString)
			.forEach(print);
		
	}
}

package Streams; 

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;

public class Map {
	public static void main(String[] args) {
		
	Consumer<String> print = System.out::print;

	List<String> marcas = Arrays.asList("BMW ", "Auidi ", "Honda ");
	marcas.stream().map(m -> m.toUpperCase()).forEach(print);
	System.out.println("\n\n");
	
	//UnaryOperator<String> maiuscula = n -> n.toUpperCase();
	UnaryOperator<String> primeiraLetra = n -> n.charAt(0) + "";
//	UnaryOperator<String> grito = n -> n + "!!! ";
	
	marcas.stream()
		.map(Ultilitarios.Maiuscula)
		.map(primeiraLetra)
		.map(Ultilitarios::grito)
		.forEach(print);
	}
}

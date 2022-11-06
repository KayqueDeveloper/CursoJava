package Streams;

import java.util.function.UnaryOperator;

public class Ultilitarios {
	
	private Ultilitarios() {
	}
	
	final public static UnaryOperator<String> Maiuscula = n -> n.toUpperCase();
	
	final public static UnaryOperator<String> PrimeiraLetra = n -> n.charAt(0) + "";
	
	final public static String grito(String n) {
		return n + "!!! ";
	}

}

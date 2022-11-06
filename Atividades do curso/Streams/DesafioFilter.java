package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class DesafioFilter {
	
	public static void main(String[] args) {
		
		Batata cliente1 = new Batata("Gilson", 6, 8);
		Batata cliente2 = new Batata("Augusta", 10, 0.8);
		Batata cliente3 = new Batata("Du'Carmo", 9, 2.5);
		Batata cliente4 = new Batata("Assis", 0, 20);
		Batata cliente5 = new Batata("Helena", 2, 1.5);
		
		List<Batata> Clientes = Arrays.asList(cliente1, cliente2, cliente3, cliente4, cliente5);
		
		Predicate<Batata> urgencia = c -> c.diasParaEntrega < 7;
		Predicate<Batata> quantidadeAlta = c -> c.quantidade > 3;
		Function<Batata, String> formatado = c -> "O(A) " + c.nome + " quer " + c.quantidade + " caixas em " + c.diasParaEntrega + " dias";
		
		System.out.println("Lista dos pedidos Urgentes: =>");
		Clientes.stream()
			.filter(urgencia)
			.filter(quantidadeAlta)
			.map(formatado)
			.forEach(System.out::println);
		
		System.out.println("\n\nLista dos pedidos: =>");
		Clientes.stream()
		.map(formatado)
		.forEach(System.out::println);
		
	}

}

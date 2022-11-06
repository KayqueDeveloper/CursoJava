package Colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
	
	public static void main(String[] args) {
		
		Queue<String> fila = new LinkedList<>();
		
		// Offer e Add -> adicionam elementos na fila.
		// A diferença é quando a fila esta cheia.
		fila.add("Ana"); // retorna falso
		fila.offer("Bia"); // Lança uma exceção
		fila.add("carlos");
		fila.offer("Daniel");
		fila.add("Rafaela");
		fila.offer("Gui");
		
		System.out.println(fila.peek()); // retorna false
		System.out.println(fila.element()); // lança exceção
		
		System.out.println(fila.poll());// retorna false
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.remove());// lança exceção
		
//		fila.size();
//		fila.clear();
//		fila.isEmpty();
//      fila.contains();
		
		
	}

}

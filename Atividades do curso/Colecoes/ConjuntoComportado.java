package Colecoes;

import java.util.SortedSet;
import java.util.TreeSet;

public class ConjuntoComportado {
	public static void main(String[] args) {
		
//		Set<String> lista = new HashSet<>();
		SortedSet<String> lista = new TreeSet<>();
		lista.add("Ana");
		lista.add("carlos");
		lista.add("luca");
		lista.add("Pedro");
		
		for (String candidato : lista){
			System.out.println(candidato);
		}
	}

}

package Colecoes;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Mapa {
	
	public static void main(String[] args) {
		
		Map<Integer, String> usuarios = new HashMap<>();
		
		usuarios.put(1, "roberto");
		usuarios.put(2, "Ricardo");
		usuarios.put(11, "Rafaela");
		usuarios.put(4, "Rebeca");
		
		System.out.println(usuarios.size());
		System.out.println(usuarios.isEmpty());
		
		System.out.println("\n" + usuarios.keySet());
		System.out.println(usuarios.values());
		System.out.println(usuarios.entrySet());
		
		System.out.println("\n" + usuarios.containsKey(4));
		System.out.println(usuarios.containsValue("roberto"));
		
		System.out.println("\n" + usuarios.get(4));
//		System.out.println(usuarios.remove(1));
		
		System.out.println();
		for(int chave: usuarios.keySet()) {
			System.out.println(chave);
		}
		
		System.out.println();
		for(String valor: usuarios.values()) {
			System.out.println("--> " + valor);
		}
		
		System.out.println();
		for(Entry<Integer, String> registro: usuarios.entrySet()) {
			System.out.print(registro.getKey() + " --> ");
			System.out.println(registro.getValue());
		}
				
	}

}

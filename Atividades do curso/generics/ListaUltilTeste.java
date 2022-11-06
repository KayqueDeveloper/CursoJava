package generics;

import java.util.Arrays;
import java.util.List;

public class ListaUltilTeste {
	
	public static void main(String[] args) {
		
	List<String> langs = Arrays.asList("a", "b", "c");
	List<Integer> nums = Arrays.asList(1, 2, 3);
	
	//Metodos com generics
	String ultimaLang = ListaUltil.getUltimo(langs);
	Integer ultimoNum = ListaUltil.<Integer>getUltimo(nums);

	System.out.println(ultimaLang);
	System.out.println(ultimoNum);
	
	}

}

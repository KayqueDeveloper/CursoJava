package generics;

import java.util.List;

public class ListaUltil {
	
	public static <T> T getUltimo(List<T> lista) {
		return lista.get(lista.size() - 1);
	}

}

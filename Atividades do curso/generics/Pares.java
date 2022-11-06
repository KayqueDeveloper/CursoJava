package generics;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

public class Pares<C extends Number, V> {

	private final Set<Par<C, V>> itens = new HashSet<>();
	
	public void adicionar(C chave, V valor) {
		if (chave == null) return;
		
		Par<C, V> novoPar = new Par<C, V>(chave, valor);
		
		if (itens.contains(novoPar)) {
			itens.remove(novoPar);
		}
		
		itens.add(new Par<C, V>(chave, valor));
	}
	
	public V getValor(C chave) {
		if(chave == null) return null;
		
		Optional<Par<C, V>> parOpcional = itens.stream()
				.filter(par -> par.getChave().equals(chave))
				.findFirst();
		
		return parOpcional.isPresent() ? parOpcional.get().getValor() : null;
	}
}

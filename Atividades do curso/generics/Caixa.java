package generics;

public class Caixa<T> {
	
	private T coisa;

	public T Abrir() {
		return coisa;
	}

	public void Guardar(T coisa) {
		this.coisa = coisa;
	}
	
	

}

package generics;

public class ParTeste {

	public static void main(String[] args) {
		
		Pares<Integer, String> resultado = new Pares<>();
		
		resultado.adicionar(1, "Maria");
		resultado.adicionar(2, "Pedro");
		resultado.adicionar(3, "Gui");
		resultado.adicionar(4, "Ana");
		resultado.adicionar(2, "Rebecaé");
		
		System.out.println(resultado.getValor(2));
		
		
	}
}

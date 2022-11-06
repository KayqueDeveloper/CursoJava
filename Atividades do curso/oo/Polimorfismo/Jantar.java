package oo.Polimorfismo;

public class Jantar {
	
	public static void main(String[] args) {
		
		Pessoa convidado = new Pessoa(99.65);
		
		comida ingrediente1 = new Arroz();
		comida ingrediente2 = new Feijao();
		comida sobremesa = new Sorvete();
		
//		comida ingrediente3 = new comida(0.3);      nao posso instanciar classe abstrata
		
		System.out.println(convidado.getPeso());
		
		convidado.comer(ingrediente1);
		convidado.comer(ingrediente2);
		
		System.out.println(convidado.getPeso());

		convidado.comer(sobremesa);
		
		System.out.println(convidado.getPeso());
	}

}

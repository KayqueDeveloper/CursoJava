package oo.composicao;

public class CompraTeste {
	
	public static void main(String[] args) {
		
		
		//Item babado = new Item("eofoojfew", 2, 3);
		
		Compra compra1 = new Compra();
		compra1.Cliente = "Joao Pedro";
		compra1.adicionar("caneta", 20, 7.45);
		compra1.adicionar("Borracha", 12, 3.89);
		compra1.adicionar("Caderno", 3, 18.79);
		
		System.out.println(compra1.Lista_Itens.size());
		
		System.out.println(compra1.ValorTotal());
		
		
		for(Item Itens: compra1.Lista_Itens) {
			String Plural = "";
			if(Itens.quantidade > 1) {
				Plural = "s";
			}
			System.out.println(Itens.quantidade + " " +  Itens.nome + Plural + " R$" + Itens.preco);
			
		}
		
	}

}

package oo.composicao.desafio;

public class ClienteTeste {
	
	public static void main(String[] args) {
		Produto Caneta = new Produto("Caneta", 1.00);
		Produto Lapis = new Produto("Lapis", 0.50);
		Produto Borracha = new Produto("Borracha", 2.00);
		Produto Caderno = new Produto("Caderno", 12.00);
		
		Cliente cliente1 = new Cliente("kayque");
		
		Compra carrinho_1 = new Compra();
		carrinho_1.Adicionar(Caneta, 10);
		carrinho_1.Adicionar(Lapis, 2);
		Compra carrinho_2 = new Compra();
		carrinho_2.Adicionar(Caderno, 3);
		carrinho_2.Adicionar(Borracha, 15);
		
		cliente1.Adicionar_compra(carrinho_2, carrinho_1);
		
		System.out.println(cliente1.Valor_Total());
		
	}

}

package oo.composicao.desafio;

import java.util.ArrayList;

public class Compra {
	
	final ArrayList<Item> Carrinho = new ArrayList<>();
	
	void Adicionar(Produto item, int qntd) {
		this.Carrinho.add(new Item(item, qntd));
	}
	
	double ValorTotalCarrinho() {
		double total = 0;
		for(Item totalfor: Carrinho) {
			total += totalfor.quantidade * totalfor.produto.preco;	
		}
		return total;
	}
}

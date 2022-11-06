package oo.composicao;

import java.util.ArrayList;

public class Compra {
	
	String Cliente;
	ArrayList<Item> Lista_Itens = new ArrayList<>();
	
	void adicionar(Item item) {
		Lista_Itens.add(item);
		item.compra = this;
	}
	
	void adicionar(String nome, int quantidade, double preco) {
		adicionar(new Item(nome, quantidade, preco));
	}
	
	double ValorTotal() {
		double total = 0;
	for(Item item: Lista_Itens) {
		total += item.quantidade * item.preco;
		}
	return total;
	}

}

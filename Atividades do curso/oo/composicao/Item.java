package oo.composicao;

public class Item {
	
	String nome;
	int quantidade;
	double preco;
	Compra compra;
	
	Item(String nome, int quantidade, double preco){
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
		
	}

}

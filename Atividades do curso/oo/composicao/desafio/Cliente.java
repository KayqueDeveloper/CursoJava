package oo.composicao.desafio;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
	
	final String nome;
	final List<Compra> Lista_compras = new ArrayList<>();
	
	Cliente(String nome){
		this.nome = nome;
	}
	
	void Adicionar_compra(Compra compras) {
		Lista_compras.add(compras);
	}
	void Adicionar_compra(Compra compras1, Compra compras2) {
		Lista_compras.add(compras1);
		Lista_compras.add(compras2);
	}
	void Adicionar_compra(Compra compras1, Compra compras2, Compra compras3) {
		Lista_compras.add(compras1);
		Lista_compras.add(compras2);
		Lista_compras.add(compras3);
		
	}
	
	double Valor_Total() {
		double total = 0;
		for(Compra compratotal: Lista_compras) {
			total += compratotal.ValorTotalCarrinho();
		}
		return total;
	}

}

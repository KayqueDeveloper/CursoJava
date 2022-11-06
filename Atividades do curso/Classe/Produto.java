package Classe;

public class Produto {

	String nome;
	double preco;
	static double desconto = 0.25;
	
	Produto(String nomeInicial){
		nome = nomeInicial;
	}

	double preco_com_desconto() {
		return preco * (1 - desconto);
	}
	double preco_com_desconto(double desconto_do_gerente) {
		return preco * ( 1 - desconto + desconto_do_gerente);
	}
}

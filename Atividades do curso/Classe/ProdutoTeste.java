package Classe;

public class ProdutoTeste {

	public static void main(String[] args) {
		
		Produto p1 = new Produto("notebook");
		p1.preco = 4356.89;
		
		Produto p2 = new Produto("Caneta Preta");
		p2.preco = 12.56;
		
//		Produto.desconto = 0.30;
		
		System.out.println(p1.nome + "" + p1.preco_com_desconto());
		System.out.println(p2.nome + "" + p2.preco_com_desconto());
		
		
		double precoFinal = p1.preco_com_desconto();
		double precofinal2 = p2.preco_com_desconto();
		double mediacarrinho = (precoFinal + precofinal2) / 2;
		
		System.out.printf("A media do seu carrinho e de R$%.2f", mediacarrinho);
		
	}
}

package teste.basico;

import infra.DAO;
import modelo.basico.Produto;

public class NovoProduto {

	public static void main(String[] args) {
		
		DAO<Produto> dao = new DAO<>(Produto.class);
		
		Produto produto = new Produto("Monitor 23'", 789.98);
		
		dao.abrirT().incluir(produto).fecharT();
		System.out.println("ID do produto: " + produto.getId());
		
		
		dao.fechar();
		
	}
}

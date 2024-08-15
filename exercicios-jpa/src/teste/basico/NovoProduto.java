package teste.basico;

import infra.DAO;
import modelo.basico.Produto;

public class NovoProduto {

	public static void main(String[] args) {
		
		Produto produto = new Produto("Monito 27", 789.98);
		
		DAO<Produto> dao = new DAO<>(Produto.class);
		dao.incluirComTransaction(produto).fechar();
		
		
		System.out.println("ID do produto: " + produto.getId());
	}
}

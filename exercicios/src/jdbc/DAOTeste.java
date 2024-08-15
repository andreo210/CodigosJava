package jdbc;

import java.io.IOException;

public class DAOTeste {

	public static void main(String[] args) throws IOException {
		
		DAO dao = new DAO();
		
		String sql = "INSERT INTO pessoas (nome, codigo) VALUES (?, ?)";
		System.out.println(dao.incluir(sql, "João da Silva", 1008));
		System.out.println(dao.incluir(sql, "Ana Julia", 1009));
		System.out.println(dao.incluir(sql, "Djalma Pereira", 10012));
		
		dao.close();
	}
}

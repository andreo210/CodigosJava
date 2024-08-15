package jdbc;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class CriarTabelaPessoa {

	public static void main(String[] args) throws SQLException, IOException {
		Connection conexao = FabricaConexao.getConexao();
		String sql = "CREATE TABLE PESSOAS ("
				+"codigo INT AUTO_INCREMENT PRIMARY KEY,"
				+"nome VARCHAR(80) NOT NULL"
				+")";
		
		Statement stmt = conexao.createStatement();//comando sql
		stmt.execute(sql);
		
		System.out.println("tabela criada");		
		conexao.close();		
	}

}

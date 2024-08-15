package jdbc;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class FabricaTEST {

	public static void main(String[] args) throws SQLException, IOException {
		Connection conexao = FabricaConexao.getConexao();	
		
		Statement stmt = conexao.createStatement();//comando sql
		stmt.execute("CREATE DATABASE IF NOT EXISTS curso_java");	
		
		System.out.println("banco criado com sucesso");		
		conexao.close();		

	}

}

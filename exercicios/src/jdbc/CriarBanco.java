package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CriarBanco {

	public static void main(String[] args) throws SQLException {
		
		final String url = "jdbc:mysql://localhost?verifyServerCertificate=false&useSSL=true";
		final String user = "root";
		final String senha = "12345678";
		
		Connection conexao = DriverManager.getConnection(url, user, senha);//conectando com banco
		
		Statement stmt = conexao.createStatement();//comando sql
		stmt.execute("CREATE DATABASE IF NOT EXISTS curso_java");
		
		System.out.println("banco criado com sucesso");
		
		conexao.close();
	}

}

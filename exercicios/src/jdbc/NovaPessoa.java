package jdbc;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;



public class NovaPessoa {

	public static void main(String[] args) throws SQLException, IOException {
		
		System.out.println("Informe seu nome");
		
		Scanner entrada = new Scanner(System.in);
		String nome = entrada.nextLine();
		
		Connection conexao = FabricaConexao.getConexao();		
		String sql = "INSERT INTO pessoas (nome) VALUES (?)";
		
		PreparedStatement stmt = conexao.prepareStatement(sql);//comando sql
		stmt.setString(1, nome);//primeiro parametro na interrogação , no caso só tem um
		
		stmt.execute();
		
		System.out.println("pessoa inserida");		
		
		entrada.close();

	}

}

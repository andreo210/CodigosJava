package jdbc;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;



public class AlterarPessoa {

	public static void main(String[] args) throws SQLException, IOException {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("informe o codigo da pessoa:");
		int codigo= entrada.nextInt();
		
		String select = "select codigo,nome from pessoas where codigo = ? ";
		String update  = "update pessoas set nome = ? where codigo = ? ";
		
		Connection conexao = FabricaConexao.getConexao();
		java.sql.PreparedStatement stmt = conexao.prepareStatement(select);
		stmt.setInt(1, codigo);//parametro 1 da string select
		ResultSet r = stmt.executeQuery();
		
		if (r.next()) {
			Pessoa1 p = new Pessoa1(r.getInt(1), r.getString(2));
			System.out.println("O nome atua é : "+ p.getNome());
			entrada.nextLine();
			
			System.out.println("informe o novo nome:");
			String novoNome = entrada.nextLine();
			
			stmt.close();
			stmt = conexao.prepareStatement(update);
			stmt.setString(1, novoNome); //parametro 1 da string update
			stmt.setInt(2, codigo);//parametro 2 da string update
			stmt.execute();
			
			System.out.println("pessoa alterada com sucesso :");
		}
		
		conexao.close();
		entrada.close();

	}

}

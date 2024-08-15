package jdbc;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class ExcluirPessoa {

	public static void main(String[] args) throws SQLException, IOException {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("informe o codigo da pessoa:");
		int codigo= entrada.nextInt();
		
		Connection conexao = FabricaConexao.getConexao();		
		String sql = "delete from pessoas where codigo = ?";
		
		PreparedStatement stmt = conexao.prepareStatement(sql);//comando sql
		stmt.setInt(1,codigo);
		int contador = stmt.executeUpdate();
		
		if (contador > 0) {
			System.out.println("pessoa excluida com sucesso");
		}else {
			System.out.println("nada feito");
		}
		System.out.println("linha afetadas "+ contador);
		
		conexao.close();
		entrada.close();

	}

}

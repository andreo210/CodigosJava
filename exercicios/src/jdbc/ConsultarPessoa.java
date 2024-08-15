package jdbc;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ConsultarPessoa {

	public static void main(String[] args) throws SQLException, IOException {
		
		Scanner entrada = new Scanner(System.in);
		Connection conexao = FabricaConexao.getConexao();	
		String sql = "SELECT nome FROM pessoas WHERE nome LIKE ?";		
		
		System.out.println("informe o valor para pesquisa: ");
		String valor = entrada.nextLine();
		
		PreparedStatement stmt = conexao.prepareStatement(sql);//comando sql
		stmt.setString(1, "%"+entrada+"%");
		ResultSet resultado = stmt.executeQuery(sql);
		
		List<Pessoa1> pessoa = new ArrayList<>();
		
		while (resultado.next()) {
			int codigo = resultado.getInt("codigo");
			String nome = resultado.getString("nome");
			pessoa.add(new Pessoa1(codigo, nome));
			
		}
		
		for (Pessoa1 pessoa1 : pessoa) {
			System.out.println(pessoa1.getCodigo() +"===>"+pessoa1.getNome());		
		}
		
		stmt.close();
		conexao.close();
		entrada.close();

	}

}

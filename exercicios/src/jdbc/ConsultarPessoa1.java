package jdbc;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ConsultarPessoa1 {

	public static void main(String[] args) throws SQLException, IOException {

		Connection conexao = FabricaConexao.getConexao();	
		String sql = "select * from pessoas";		
		
		Statement stmt = conexao.createStatement();//comando sql
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


	}

}

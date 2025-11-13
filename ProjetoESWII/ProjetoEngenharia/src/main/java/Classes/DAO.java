package Classes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DAO {
	Connection conexao = null;
	String url = "jdbc:mysql://localhost:3306/bdContratos";
	String user = "root";
	String password = "Aluno@321";
	
	public Connection conectar() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conexao = DriverManager.getConnection(url, user, password);
			System.out.println("Conexão Efetuada! - " + conexao);
		}
		
		catch(Exception e) {
			System.out.println("Erro na conexão " + e.getMessage());
			conexao = null;
		}
		
		finally {
			return conexao;
		}
	}
	
	public void desconectar(Connection conexao) {
		try {
			conexao.close();
			conexao = null;
		}
		
		catch(Exception e) {
			System.out.println("Ocorreu o seguinte erro " + e.getMessage());
		}
	}
}

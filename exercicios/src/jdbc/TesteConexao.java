package jdbc;

import java.sql.Connection;
//import java.sql.DriverManager;
import java.sql.SQLException;

public class TesteConexao {
    public static void main(String[] args)throws SQLException{
    	//final String url="jdbc:mysql://localhost?verifyServerCertificate=false&useSSL=true";
    	//final String user="root";
    	//final String senha="1234";
    	Connection conexao=FabricaDeConexao.getConnection();
    	System.out.println("Conexão realizada com sucesso!!!");
    	conexao.close();
    }
}

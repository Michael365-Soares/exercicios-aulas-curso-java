package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class NovaPessoa {
    public static void main(String[] args)throws SQLException {
    	Scanner input=new Scanner(System.in);
    	Connection conexao=FabricaDeConexao.getConnection();
    	System.out.println("Informe um nome:");
    	String nome=input.nextLine();
    	String sql="insert into pessoas(nome) values(?);";
    	PreparedStatement stmt=conexao.prepareStatement(sql);
    	stmt.setString(1,nome);
    	stmt.execute();
    	System.out.println("Pessoa incluida com sucesso!!!");
    	input.close();
    	conexao.close();
    }
}

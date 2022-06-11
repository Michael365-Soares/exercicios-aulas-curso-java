package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class ExcluirPessoa {
     public static void main(String[] args)throws SQLException {
    	 Connection conexao=FabricaDeConexao.getConnection();
    	 Integer codigo=Integer.parseInt(JOptionPane.showInputDialog("Digite o c�digo que deseja excluir"));
    	 String sql="delete from pessoas where codigo=?;";
    	 PreparedStatement stmt=conexao.prepareStatement(sql);
    	 stmt.setInt(1,codigo);
    	 stmt.execute();
    	 System.out.println("Pessoa de c�digo: "+codigo+" exclu�da com sucesso!");
    	 stmt.close();
    	 List<Pessoa> p=new ArrayList<>();
    	 String sqlLista="select codigo,nome from pessoas;";
    	 stmt=conexao.prepareStatement(sqlLista);
    	 ResultSet lista=stmt.executeQuery();
    	 while(lista.next()) {
    		 p.add(new Pessoa(lista.getInt(1),lista.getString(2)));
    	 }
    	 p.forEach(pe->System.out.println("C�digo>>>"+pe.getCodigo()+">>>Nome>>>>"+pe.getNome()));
    	 stmt.close();
    	 conexao.close();
     }
}

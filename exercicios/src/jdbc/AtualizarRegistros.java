package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class AtualizarRegistros {
    public static void main(String[] args)throws SQLException {
    	Connection conexao=FabricaDeConexao.getConnection();
    	int codigo=Integer.parseInt(JOptionPane.showInputDialog("Digite o código da pessoa a qual deseja atualizar:"));
    	String nome=JOptionPane.showInputDialog("Digite o novo nome o qual deseja:");
    	String sql="update pessoas set nome=? where codigo=?;";
    	PreparedStatement stmt=conexao.prepareStatement(sql);
    	stmt.setString(1,nome);
    	stmt.setInt(2,codigo);
    	stmt.execute();
    	stmt.close();
    	//Consultando registro atualizado
    	String sql2="select *from pessoas where codigo=?;";
    	PreparedStatement stmt1=conexao.prepareStatement(sql2);
    	stmt1.setInt(1,codigo);
    	stmt1.execute();
    	ResultSet res=stmt1.executeQuery();
    	if(res.next()) {
    		Pessoa p=new Pessoa(res.getInt("codigo"),res.getString("nome"));
    		JOptionPane.showMessageDialog(null,"A nome da pessoa de código: "+p.getCodigo()+" foi atualizado para: "+p.getNome());
    	}
    	stmt1.close();
    	conexao.close();
    }
}

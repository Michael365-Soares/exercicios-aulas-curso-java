package jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ConsultarPessoas {
    public static void main(String[] args) throws SQLException {
    	List<Pessoa> lista=new ArrayList<>();
    	Connection conexao=FabricaDeConexao.getConnection();
    	String sql="select codigo,nome from pessoas;";
        Statement stmt=conexao.createStatement();
    	ResultSet resultado= stmt.executeQuery(sql);
    	while(resultado.next()) {
    		lista.add(new Pessoa(resultado.getInt("codigo"),resultado.getString("nome")));
    	}
    	lista.forEach(p->System.out.println(">>>Código: "+p.getCodigo()+">>>>Nome: "+p.getNome()));
    	//for(Pessoa p:lista) {
    		//System.out.println("Código: "+p.getCodigo());
    		//System.out.println("Nome: "+p.getNome());
    	//}
    	stmt.close();
    	conexao.close();
    }
}

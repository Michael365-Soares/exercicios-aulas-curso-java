package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ConsultarRegistros2 {
     public static void main(String[] agrs) throws SQLException {
    	 Connection conexao=FabricaDeConexao.getConnection();
    	 List<Pessoa> lista=new ArrayList<Pessoa>();
    	 Scanner input=new Scanner(System.in);
    	 System.out.println("Digite o ID a ser pesquisado:");
    	 String filtro1=input.nextLine();
    	 System.out.println("Digite o NOME a ser pesquisado:");
    	 String filtro2=input.nextLine();
    	 String sql="select *from pessoas where codigo>? and codigo<?";
    	 PreparedStatement stmt=conexao.prepareStatement(sql);
    	 stmt.setString(1,filtro1+"%");
    	 stmt.setString(2,filtro2+"%");
    	 ResultSet res=stmt.executeQuery();
    	 while(res.next()) {
    		 lista.add(new Pessoa(res.getInt("codigo"),res.getString("nome")));
    	 }
    	 lista.forEach(p->System.out.println("Código>>>"+p.getCodigo()+">>>Nome>>>>"+p.getNome()));
    	 input.close();
    	 stmt.close();
    	 conexao.close();
     }
}

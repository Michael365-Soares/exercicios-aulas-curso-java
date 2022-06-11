package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DAO {
   private Connection conexao;

   private Connection getConexao() {
	   try {
			if(conexao!=null&&!conexao.isClosed()) {
				   return conexao;
			}
	   } catch (SQLException e) {
		    throw new RuntimeException(e);
	   }
	   conexao=FabricaDeConexao.getConnection();
	   return conexao;
   }
   
   private void adicionarAtributos(PreparedStatement stmt,Object[] atributos)throws SQLException  {
	   int index=1;
	   for(Object atributo:atributos) {
		   if(atributo instanceof String) {
			   stmt.setString(index,(String)atributo);
		   }else if(atributo instanceof Integer) {
			   stmt.setInt(index,(Integer)atributo);
		   }else if(atributo instanceof Double) {
			   stmt.setDouble(index,(Double)atributo);
		   }else if(atributo instanceof Boolean) {
			   stmt.setBoolean(index,(Boolean) atributo);
		   }
		   index++;
	   }
   }
   
   private void selecionarAtributos(PreparedStatement stmt,Object[] atributos)throws SQLException  {
	     int index=1;
	     for(Object atributo:atributos) {
	    	 if(atributo instanceof String) {
	    		 stmt.setString(index,(String)atributo);
	    	 }else if(atributo instanceof Integer) {
	    		 stmt.setInt(index,(Integer)atributo);
	    	 }
	    	 index++;
	     }   
   }
   
   public int incluir(String sql,Object... atributos) {
	   try {
		   PreparedStatement stmt=getConexao().prepareStatement(
				   sql,PreparedStatement.RETURN_GENERATED_KEYS);
		   this.adicionarAtributos(stmt, atributos);
		   if(stmt.executeUpdate()>0) {
			   ResultSet res=stmt.getGeneratedKeys();
			   if(res.next()) {
				   return res.getInt(1);
			   }
		   }
		   return -1;
	   }catch(SQLException e) {
		   throw new RuntimeException(e);
	   }
   }
   
   public Object selecionar(String sql,Object... atributos) {
	   try {
           PreparedStatement stmt=getConexao().prepareStatement(sql);
           this.selecionarAtributos(stmt, atributos);
        	   ResultSet resp=stmt.executeQuery();
        	   List<String> p=new ArrayList<String>();
        	   while(resp.next()) {
        		  p.add(resp.getString("nome")); 
        	   }
           return p.size()>0?p:"Nenhum registro";
	   }catch(SQLException e) {
		   throw new RuntimeException(e);
	   }
   
   }
   
}

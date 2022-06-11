package jdbc;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class FabricaDeConexao{
     public static Connection getConnection() {
    	 try {
    		 Properties prop=getProperties();
    		 final String url=prop.getProperty("banco.url");
    		 final String user=prop.getProperty("banco.usuario");
    		 final String senha=prop.getProperty("banco.senha");
    		 return DriverManager.getConnection(url,user,senha);
    	 }catch(SQLException| IOException e) {
    		 throw new RuntimeException(e);
    	 }
     }
     
     private static Properties getProperties() throws IOException {
    	 Properties prop=new Properties();
    	 //String caminhoArq="conexao.properties";
    	 FileInputStream file=new FileInputStream("C:\\Users\\micha\\Documents\\conexao.properties");
    	 //prop.load(FabricaDeConexao.class.getResourceAsStream(caminhoArq));
    	 prop.load(file);
    	 return prop;
     }
}

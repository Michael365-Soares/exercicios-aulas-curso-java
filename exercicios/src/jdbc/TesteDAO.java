package jdbc;

import java.util.List;

public class TesteDAO {
   public static void main(String[] args) {
	   DAO dao=new DAO();
	   //System.out.println(dao.incluir("insert into pessoas(codigo,nome) values(?,?);",123,"Michael Soares"));
	   List<String> p=(List<String>)dao.selecionar("select *from pessoas where nome like ?;","G%");
	   p.forEach(System.out::println);
	   
   }
}

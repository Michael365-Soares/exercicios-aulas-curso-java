package teste.basico;

import java.util.List;
import java.util.function.Consumer;

import infra.DAO;
import modelo.basico.Produto;

public class InserirProdutoDAO {
   public static void main(String[] args) {
//	   Produto prod1=new Produto("Caneta",2.50);
//	   Produto prod2=new Produto("Lápis",1.50);
//	   Produto prod3=new Produto("Caderno",20.00);
//	   Produto prod4=new Produto("Livro",50.00);
//	   Produto prod5=new Produto("Cola",2.00);
//	   Produto prod6=new Produto("Borracha",1.50);
	   DAO<Produto> dao=new DAO<>(Produto.class);
//	   dao.incluirAtomico(prod1).incluirAtomico(prod2).
//	   incluirAtomico(prod3).incluirAtomico(prod4).incluirAtomico(prod5).incluirAtomico(prod6);
	   List<Produto> lista=dao.obterTodos();
	   dao.fecharDAO();
	   Consumer<String> output=System.out::println;
	   lista.stream().map(prod->prod.toString()).forEach(output);
   }
}

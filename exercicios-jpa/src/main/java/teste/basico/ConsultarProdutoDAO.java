package teste.basico;

import java.util.ArrayList;
import java.util.List;

//import infra.DAO;
import infra.ProdutoDAO1;
import modelo.basico.Produto;

public class ConsultarProdutoDAO {
   public static void main(String[] args) {
	   //DAO<Produto> dao=new DAO<>(Produto.class);
	   ProdutoDAO1 dao=new ProdutoDAO1();
	   List<Produto> lista=new ArrayList<>();
	   lista=dao.obterTodos(10, 0);
	   lista.stream().forEach(System.out::println);
	   double precoTotal=lista.stream().map(p->p.getPreco()).reduce(0.0,(t,p)->t+p).doubleValue();
	   System.out.println("Preço total: "+precoTotal);
	   dao.fecharDAO();
   }
}

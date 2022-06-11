package infra;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.basico.Produto;

public class ProdutoDao {
    private EntityManagerFactory emf=Persistence.createEntityManagerFactory("exercicios-jpa");
    private EntityManager em=emf.createEntityManager();
    
    public List<Produto> consultarProdutos() {
    	String sql="select u from Produto u";
    	List<Produto> produtos=new ArrayList<>();
    	produtos=em.createQuery(sql,Produto.class).setMaxResults(5).getResultList();
    	return produtos;
    }
    
    public void adicionarProduto(Produto prod) {
    	em.getTransaction().begin();
        em.persist(prod);
    	em.getTransaction().commit();
    	System.out.println("Produto adicionado com sucesso");
    }
}

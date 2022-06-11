package infra;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class DAO<E> {
    private static EntityManagerFactory emf;
    private EntityManager em;
    private Class<E> classe;
    
    static {
    	try {
    		emf=Persistence.createEntityManagerFactory("exercicios-jpa");
    	}catch(RuntimeException e) {
    		System.out.println(" "+e.getMessage());
    	}
    }
    
    public DAO() {
    	this(null);
    }
    
    public DAO(Class<E> classe) {
    	this.classe=classe;
    	em=emf.createEntityManager();
    }
    
    public DAO<E> abrirT(){
        em.getTransaction().begin();
        return this;
    }
    
    public DAO<E> fecharT(){
        em.getTransaction().commit();
        return this;
    }
    
    public DAO<E> incluir(E entidade){
        em.persist(entidade);
        return this;
    }
    
    public DAO<E> incluirAtomico(E entidade){
        return this.abrirT().incluir(entidade).fecharT();
    }
    
    public List<E> obterTodos(int qtdRegistros,int deslocamento){
        if(classe==null) {
           throw new UnsupportedOperationException("Classe nula!");
        }
        String jpql="select e from "+classe.getName()+" e";
        List<E> lista=new ArrayList<>();
        lista=em.createQuery(jpql,classe).
        setMaxResults(qtdRegistros).
        setFirstResult(deslocamento).
        getResultList();
        return lista;
    }
    
    public List<E> obterTodos(){
       return this.obterTodos(10,0);
    }
    
    public void fecharDAO() {
    	this.em.close();
    }
    
}

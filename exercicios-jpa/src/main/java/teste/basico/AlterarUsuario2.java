package teste.basico;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.basico.Usuario;

public class AlterarUsuario2 {
     public static void main(String[] args) {
    	 EntityManagerFactory emf=Persistence.createEntityManagerFactory("exercicios-jpa");
    	 EntityManager em=emf.createEntityManager();
    	 em.getTransaction().begin();
    	 Usuario user=new Usuario();
    	 user=em.find(Usuario.class,5L);
    	 user.setNome("Maycon Soares");
    	 user.setEmail("maycon@soares.com.br");
    	// em.merge(user);
    	 em.getTransaction().commit();
    	 em.close();
    	 emf.close();
     }
}

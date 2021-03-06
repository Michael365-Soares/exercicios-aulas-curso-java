package teste.basico;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.basico.Usuario;

public class AlterarUsuario3 {
    public static void main(String[] args) {
    	EntityManagerFactory emf=Persistence.createEntityManagerFactory("exercicios-jpa");
    	EntityManager em=emf.createEntityManager();
    	em.getTransaction().begin();
    	Usuario user=em.find(Usuario.class,2L);
    	em.detach(user);
    	user.setNome("Leonardo Leitao");
    	user.setEmail("leonardo@gmail.com");
    	em.merge(user);
    	em.getTransaction().commit();
    	em.close();
    	emf.close();
    }
}

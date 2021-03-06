package teste.basico;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.basico.Usuario;

public class AlterarUsuario1 {
   public static void main(String[] args) {
	   EntityManagerFactory emf=Persistence.createEntityManagerFactory("exercicios-jpa");
	   EntityManager em=emf.createEntityManager();
	   em.getTransaction().begin();
	   Usuario user=em.find(Usuario.class,7L);
	   user.setNome("Leonardo");
	   user.setEmail("leonardo@burro.com.br");
	   em.merge(user);
	   em.getTransaction().commit();
	   em.close();
	   emf.close();
   }
}

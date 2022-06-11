package teste.basico;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.basico.Usuario;

public class ObterUsuario {
   public static void main(String[] args) {
	   EntityManagerFactory emf=Persistence.createEntityManagerFactory("exercicios-jpa");
	   EntityManager em=emf.createEntityManager();
	   Usuario user=em.find(Usuario.class,1L);
	   System.out.println(user.getNome()+"-"+user.getEmail()+"-"+user.getId());
	   em.close();
	   emf.close();
   }
}

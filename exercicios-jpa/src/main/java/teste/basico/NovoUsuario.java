package teste.basico;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.basico.Usuario;

public class NovoUsuario {
   public static void main(String[] args) {
	   EntityManagerFactory emf=Persistence.createEntityManagerFactory("exercicios-jpa");
	   EntityManager em=emf.createEntityManager();
	   Usuario u1=new Usuario("Michael Soares","michaelsoares365@gmail.com");
	   Usuario u2=new Usuario("Antonia","antonia365@gmail.com");
	   Usuario u3=new Usuario("Ryan","ryan365@gmail.com");
	   Usuario u4=new Usuario("Lucas","lucas365@gmail.com");
	   Usuario u5=new Usuario("Gani Gol","gabigol365@gmail.com");
	   em.getTransaction().begin();
	   em.persist(u1);
	   em.persist(u2);
	   em.persist(u3);
	   em.persist(u4);
	   em.persist(u5);
	   em.getTransaction().commit();
	   em.close();
	   emf.close();
   }
}

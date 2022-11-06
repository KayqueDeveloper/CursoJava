package teste.basico;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.basico.Usuario;

public class AlterarUsuario3 {

	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exercicios-JPA");
		EntityManager em = emf.createEntityManager();

		em.getTransaction().begin();

		Usuario usuario = em.find(Usuario.class, 7L);
		em.detach(usuario); // so muda com merge
		
		usuario.setNome("Leonardo");

		em.merge(usuario);

		em.getTransaction().commit();

		em.close();
		emf.close();
	}
}

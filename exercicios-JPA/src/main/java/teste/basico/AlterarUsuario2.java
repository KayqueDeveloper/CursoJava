package teste.basico;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.basico.Usuario;

public class AlterarUsuario2 {

	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exercicios-JPA");
		EntityManager em = emf.createEntityManager();

		em.getTransaction().begin();

		Usuario usuario = em.find(Usuario.class, 7L);
		usuario.setNome("Leonardo");

	//	em.merge(usuario); altera da mesma forma por estar gerendiado pelo *find()*

		em.getTransaction().commit();

		em.close();
		emf.close();
	}
}

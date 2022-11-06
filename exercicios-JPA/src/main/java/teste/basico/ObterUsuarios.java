package teste.basico;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.basico.Usuario;

public class ObterUsuarios {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exercicios-JPA");
		EntityManager em = emf.createEntityManager();
		
//		String jpql = "select u from Usuario u";
//		TypedQuery<Usuario> query = em.createQuery(jpql, Usuario.class);
//		query.setMaxResults(5);
//		
//		List<Usuario> usuarios = query .getResultList();
		
		List<Usuario> usuarios = em
						.createQuery("select u from Usuario u")
						.setMaxResults(5)
						.getResultList();
		
		
		
		for(Usuario u: usuarios) {
			System.out.println("ID: " + u.getId() + " Email: " + u.getEmail());
		}
		
		
		em.close();
		emf.close();
	}
}

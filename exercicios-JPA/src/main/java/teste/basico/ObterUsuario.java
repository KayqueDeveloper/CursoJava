package teste.basico;

import javax.persistence.*;

import modelo.basico.Usuario;

public class ObterUsuario {

	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exercicios-JPA");
		EntityManager em = emf.createEntityManager();

		Usuario usuario = em.find(Usuario.class, 7L);
		System.out.println(usuario.getNome());
		
		//posso criar uma querry pelo em: crateNativeQuerry():
		
		em.close();
		emf.close();

	}
}

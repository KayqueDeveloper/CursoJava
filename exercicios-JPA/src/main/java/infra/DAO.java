package infra;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

public class DAO<E>{

	private static EntityManagerFactory emf;
	private EntityManager em;
	private Class<E> classe;
	
	static {
		try {
			emf = Persistence.createEntityManagerFactory("exercicios-JPA");
		}catch (Exception e) {
			// logar -> log4j
		}
	}
	
	public DAO() {
		this(null);
	}

	public DAO(Class<E> classe) {
		this.classe = classe;
		em = emf.createEntityManager();
	}
	
	
	public DAO<E> abrirT() {
		em.getTransaction().begin();
		return this;
	}
	
	public DAO<E> fecharT() {
		em.getTransaction().commit();
		return this;
	}
	
	public DAO<E> incluir(E entidade) {
		em.persist(entidade);
		return this;
	}
	
	public DAO<E> incluirAtomico(E entidade) {
		return this.abrirT().incluir(entidade).fecharT();
	}
	
	public DAO<E> remover(Object id) {
		E objeto = em.find(classe, id);
		em.remove(objeto);
		return this;
	}

	public DAO<E> removerAtomico(Object id) {
		return this.abrirT().remover(id).fecharT();
	}
	
	public E obterPorID(Object id) {
		return em.find(classe, id);
	}
	
	public List<E> obterTodos() {
		return obterTodos(10, 0);
	}
	
	public List<E> obterTodos(int limit, int deslocamento) {
		if (classe == null) {
			throw new UnsupportedOperationException("Classe nula");
		}
		
		String jpql = "SELECT e FROM " + classe.getName() + " e";
		TypedQuery<E> querry = em.createQuery(jpql, classe);
		querry.setMaxResults(limit);
		querry.setFirstResult(deslocamento);
		return querry.getResultList();
	}
	
	public void fechar() {
		em.close();
	}
	
	
	
}



















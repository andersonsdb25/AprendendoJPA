package DAO;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import Entidades.Cliente;

public class ClienteDao extends Dao {

	private Cliente cliente;

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public void cadastrar(Cliente cliente) {
		em.getTransaction().begin();
		try {
			em.persist(cliente);
			em.getTransaction().commit();

		} catch (Exception e) {
			System.out.println("Não foi possivel incluir o Cliente");
			em.getTransaction().rollback();
		}

	}

	// Lista todos os clientes
	public void listarTodosClientes(Cliente cliente) {

		Query query = em.createQuery("from Cliente");
		// System.out.println("Query Gerada" + query);
		@SuppressWarnings("unchecked")
		List<Cliente> clientes = query.getResultList();

		for (Cliente c : clientes) {
			System.out.println("Id   " + c.getId());
			System.out.println("Nome " + c.getNome());
			System.out.println("CPF  " + c.getCpf());
			System.out.println("RG   " + c.getRg());
			System.out.println("----------------------------------------------------");
		}

	}

	// Lista todos os clientes
	public Cliente pegarClientesPorId(int id) {

		Query query = em.createQuery("from Cliente c where c.id = " + id);
		// System.out.println("Query Gerada" + query);

		Cliente clientes = (Cliente) query.getSingleResult();

		return clientes;
	}

	// Exclusao de clientes
	public void excluir(Cliente cliente) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("AprendendoJPA");
		EntityManager em = emf.createEntityManager();
		try {
			Cliente client = em.find(Cliente.class, cliente.getId());
			em.getTransaction().begin();
			em.remove(client);
			em.getTransaction().commit();

		} catch (Exception e) {
			System.out.println("Não foi possivel excluir o cliente");
			em.getTransaction().rollback();
		}

	}

}

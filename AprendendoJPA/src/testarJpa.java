import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import DAO.ClienteDao;
import Entidades.Cliente;

public class testarJpa {

	public static void main(String[] args) {

		Cliente cliente = new Cliente();
		ClienteDao clienteDao = new ClienteDao();

		// Procedimento para adicionar clientes

		 cliente.setNome("Anderson Barroso"); cliente.setCpf("11111111");
		 cliente.setRg("22222222"); clienteDao.cadastrar(cliente);
		 
		 clienteDao.cadastrar(cliente);
		

		// Procedimento para excluir objetos
		/*cliente.setId(7);
		clienteDao.excluir(cliente);*/

		// Procedimento para listar dados de uma tabela com JPA

		clienteDao.listarTodosClientes(cliente);

	}

}

import DAO.ClienteDao;
import Entidades.Cliente;

public class testarJpa {

	public static void main(String[] args) {

		Cliente cliente = new Cliente();
		ClienteDao clienteDao = new ClienteDao();

		// Procedimento para adicionar clientes

		/*cliente.setNome("Zico");
		cliente.setCpf("10");
		cliente.setRg("10");
*/
		// clienteDao.cadastrar(cliente);

		// Procedimento para excluir objetos
		/*
		 * cliente.setId(7); clienteDao.excluir(cliente);
		 */

		// Procedimento para listar dados de uma tabela com JPA

		clienteDao.listarTodosClientes(cliente);
		Cliente pegacli = clienteDao.pegarClientesPorId(2);
		System.out.println("--------");
		System.out.println("Cliente pego - Id: " + pegacli.getId() + "Nome " + pegacli.getNome());
	}

}

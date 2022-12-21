/**
 * 
 */
package br.com.rpires;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import br.com.rpires.dao.ClienteDAO;
import br.com.rpires.dao.IClienteDAO;
import br.com.rpires.domain.Cliente;

public class ClienteTest {
	@Test
	public void cadastrarTest() throws Exception {
		IClienteDAO dao = new ClienteDAO();
		
		Cliente cliente = new Cliente();
		cliente.setCodigo("01");
		cliente.setNome("Rodrigo Pires");
		
		Integer qtd = dao.cadastrar(cliente);
		equals(qtd > 1);
		assertTrue(qtd == 1);
		
		//Cliente clienteBD = dao.consultar(cliente.getCodigo());
		//assertNotNull(clienteBD);
		//assertNotNull(clienteBD.getId());
		//assertEquals(cliente.getCodigo(), clienteBD.getCodigo());
		//assertEquals(cliente.getNome(), clienteBD.getNome());
	//	
		//Integer qtdDel = dao.excluir(clienteBD);
		//assertNotNull(qtdDel);
	}
}

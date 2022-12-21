package br.com.rpires;

import org.junit.Test;

import br.com.rpires.dao.IProdutoDAO;
import br.com.rpires.dao.ProdutoDAO;
import br.com.rpires.domain.Produto;
import static org.junit.Assert.assertTrue;


public class ProdutoTest {
    @Test
	public void cadastrarTest() throws Exception {
		IProdutoDAO dao1 = new ProdutoDAO();
		
		Produto produto = new Produto();
		produto.setNome("natan");
        produto.setValor("199,99");
        produto.setCodigo("16");
		
		Integer qtd = dao1.cadastrar(produto);
		equals(qtd > 1);
		assertTrue(qtd == 1);

}
}

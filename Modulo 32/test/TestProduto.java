package test;

import static org.junit.Assert.assertNotNull;



import org.junit.Test;

import src.DAO.IProdutoDAO;
import src.DAO.ProdutoDAO;
import src.Main.Produto;

public class TestProduto {
    
    private IProdutoDAO produtoDAO;

    public TestProduto() {
        produtoDAO = new ProdutoDAO();
    }
    @Test
    public void cadastrar(){
        Produto produto = new Produto();

        produto.setNome("mouse");
        produto.setValor(150);

        produto = produtoDAO.cadastrar(produto);

        assertNotNull(produto);
        assertNotNull(produto.getId());
    }

    

}

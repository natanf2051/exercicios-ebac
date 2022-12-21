package br.com.rpires.dao;

import br.com.rpires.domain.Produto;

public interface IProdutoDAO {
    
    public Integer cadastrar(Produto produto) throws Exception;
    
    public Produto consultar(String codigo) throws Exception;

    public Integer excluir(Produto produto) throws Exception;

}

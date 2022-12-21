package br.com.rpires.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import br.com.rpires.dao.jdbc.ConnectionFactory;
import br.com.rpires.domain.Produto;

public class ProdutoDAO implements IProdutoDAO {
    

    @Override
	public Integer cadastrar(Produto produto) throws Exception {
		Connection connection = null;
		PreparedStatement stm = null;
		try {
			connection = ConnectionFactory.getConnection();
			String sql = "INSERT INTO tb_produto(ID, nome, preco, codigo) VALUES (nextval('sq_produto'),?,?,?)";
            stm = connection.prepareStatement(sql);
            stm.setString(1, produto.getNome());
            stm.setString(2, produto.getValor());
            stm.setString(3, produto.getCodigo());
	
			return stm.executeUpdate();
		} catch(Exception e) {
			throw e;
		} finally {
			if (stm != null && !stm.isClosed()) {
				stm.close();
			}
			if (connection != null && !connection.isClosed()) {
				connection.close();
			}
		}
	}

	@Override
	public Produto consultar(String codigo) throws Exception {
		Connection connection = null;
		PreparedStatement stm = null;
		ResultSet rs = null;
		Produto produto = null;
		try {
			connection = ConnectionFactory.getConnection();
			String sql = "select * from tb_produto where codigo = ?";
			stm = connection.prepareStatement(sql);
			stm.setString(3, codigo);
			rs = stm.executeQuery();
			if (rs.next()) {
				produto = new Produto();
				produto.setId(rs.getLong("id"));
				produto.setCodigo(rs.getString("codigo"));
                produto.setCodigo(rs.getString("preco"));
				produto.setNome(rs.getString("nome"));
			}
			return produto;
		} catch(Exception e) {
			throw e;
		} finally {
			if (stm != null && !stm.isClosed()) {
				stm.close();
			}
			if (connection != null && !connection.isClosed()) {
				connection.close();
			}
		}
	}

	@Override
	public Integer excluir(Produto produto) throws Exception {
		Connection connection = null;
		PreparedStatement stm = null;
		try {
			connection = ConnectionFactory.getConnection();
			String sql = "DELETE FROM TB_produto WHERE CODIGO = ?";
			stm = connection.prepareStatement(sql);
			stm.setString(1, produto.getCodigo());
			return stm.executeUpdate();
		} catch(Exception e) {
			throw e;
		} finally {
			if (stm != null && !stm.isClosed()) {
				stm.close();
			}
			if (connection != null && !connection.isClosed()) {
				connection.close();
			}
		}
	}
}

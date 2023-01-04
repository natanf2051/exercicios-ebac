package test;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import DAO.AcessorioDAO;
import DAO.CarroDAO;
import DAO.IAcessorioDAO;
import DAO.ICarroDAO;
import DAO.IMarcaDAO;
import DAO.MarcaDAO;
import main.Acessorio;
import main.Carro;
import main.Marca;

public class test {
    private ICarroDAO carroDAO;

    private IMarcaDAO marcaDAO;

    private IAcessorioDAO acessorioDAO;



    public test(){
      marcaDAO = new MarcaDAO();
      carroDAO = new CarroDAO();
      acessorioDAO = new AcessorioDAO();
    }


    @Test
    public void cadastrar(){
      
        Marca marcas = criMarca("A3");
        Acessorio asse = criAcessorio("A3");

        
        Carro carro = new Carro();
        carro.setCodigo("A3");
        carro.setNome("SW4");
        carro.setCombustivel("Diesel");
        carro.setMarca(marcas);
        carro.setAcessorio(asse);
        
        
        carro = carroDAO.cadastrar(carro);

        
        
        assertNotNull(carro);
        assertNotNull(carro.getId());

    }

  	private Acessorio criAcessorio(String codigo) {
        Acessorio asses = new Acessorio();
        asses.setCodigo(codigo);
        asses.setPlus("Blindagem");



      return acessorioDAO.cadastrar(asses);
    }


    private Marca criMarca(String codigo) {
      Marca marc = new Marca();
      marc.setCodigo(codigo);
      marc.setMarca("Toyota");
      return marcaDAO.cadastrar(marc);
    }
    
}

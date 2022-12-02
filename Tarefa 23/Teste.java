import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class Teste {
    @Test
public void soMulher(){
    System.out.println("DIGITE SEUS DADOS, EX: 'NOME E SEXO: F ou M'");
    
    List<Pessoa> gente = new Pessoa().popularPessoa();
    System.out.println(gente);
   
    ExtratorListaFeminino gent = new ExtratorListaFeminino(gente);
      gent.listaMulher();
      gent.listaHomem();
      assertEquals(gent.listaMulher(), gent.listaHomem());
}
    
}

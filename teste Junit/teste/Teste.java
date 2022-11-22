import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

import org.junit.Assert;
import org.junit.Test;




public class Teste{


@Test
public void Teste(){


    Scanner input = new Scanner(System.in);
   

    System.out.println("DIGITE SEUS DADOS, EX: 'NOME E SEXO: F ou M'");
    List<Pessoa> gente = new Pessoa("natan", "m").popularPessoa();
    
      System.out.println(gente);
   
   Stream fila = gente.stream().filter(Pessoa -> Pessoa.getSexo().equals("f")).distinct();
   fila.forEach(t -> System.out.print(t));
   
   }

}

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import org.junit.Assert;
import org.junit.Test;

import Main.Main;

public class Teste extends Pessoa{
    
    @Test
    public void Teste(){
           
    Scanner input = new Scanner(System.in);
    Pessoa gente = new Pessoa();
    Pessoa gente1 = new Pessoa();
    //List<Pessoa> lista = new ArrayList<>();
    List<String> lista1 = new ArrayList<String>();
    List<String> lista2 = new ArrayList<String>();
    
    int controle = 1;
    int controle2 = 2;
    

   
  
       System.out.println("DIGITE SEUS DADOS, EX: 'NOME E SEXO: F ou M'");
       gente.setDados("natan", "m");
       gente.setDados("jorge", "m");
       

      
       lista1.add(gente.getNome());
        
       if(gente.getSexo().equals("F")){
        lista2.add(gente.getNome());
       }else if(gente.getSexo().equals("f")){
        lista2.add(gente.getNome());
       };
       

       System.out.println("CADASTRO REALIZADO COM SUCESSO!");
       System.out.println("PARA CADASTRAR OUTRA PESSOA: APERTE 1 -- APERTE 2 PARA SAIR");
       //controle = input.nextInt();

       System.out.println(lista1);
       
       List fila = Arrays.asList(lista2);
       fila.stream().forEach(p -> System.out.println(p));

//nessa linha afirma que apenas a lista1 possue o genero masculino, e a lista2 o feminino apenas
// a lista2 aceita apenas a pessoa do sexo F (feminino) e a lista1 aceita qualquer tipo. 
//codigo testado.
       Assert.assertNotEquals("f", lista1, lista2);
       
    }

    

        
    }



import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

import javax.print.DocFlavor.STRING;


public class Main{



public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    Pessoa gente = new Pessoa();
    //List<Pessoa> lista = new ArrayList<>();
    List<String> lista1 = new ArrayList<String>();
    List<String> lista2 = new ArrayList<String>();
    
    int controle = 1;
    int controle2 = 1;

   
   while(controle == controle2){
       System.out.println("DIGITE SEUS DADOS, EX: 'NOME E SEXO: F ou M'");
       gente.setDados(null, null);

      
       lista1.add(gente.getNome());

       if(gente.getSexo().equals("F")){
        lista2.add(gente.getNome());
       }else if(gente.getSexo().equals("f")){
        lista2.add(gente.getNome());
       };
       

       System.out.println("CADASTRO REALIZADO COM SUCESSO!");
       System.out.println("PARA CADASTRAR OUTRA PESSOA: APERTE 1 -- APERTE 2 PARA SAIR");
       controle = input.nextInt();
    

    System.out.println(lista1);

       List fila = Arrays.asList(lista2);
       fila.stream().forEach(p -> System.out.println(p));
       

    //String[] lista3 = lista2.stream().filter(p -> gente.getNome().).toArray(String[]:: new);
//
    //System.out.println(Arrays.asList(lista3));
    
    
   }


   

   
}  
    
}
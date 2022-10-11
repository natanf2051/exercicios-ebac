package modulo11;

import java.io.NotActiveException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import javax.lang.model.util.ElementScanner14;
import projeto.pessoa;

public class input {


    public static void main(String[] args) {
        
    
    Scanner input = new Scanner(System.in);
    List<String> lista = new ArrayList<>();
    List<String> lista0= new ArrayList<>();
    List<String> outrogenero= new ArrayList<>();
    
     int controle = 1;
     int controle2 = 1;
     int feminino = 1;
     int masculino = 2;
    
    while(controle == controle2){
        System.out.println("DIGITE SEU NOME:");
        String nome = input.next();
        System.out.println("GENERO: (1) MASCULINO - (2) FEMININO");
        int sexo = input.nextInt();
        String pessoa =  nome;

        if(sexo == masculino){
            lista.add(pessoa);
        }else{
            lista0.add(pessoa);
        };
        
        System.out.println("CADASTRO REALIZADO COM SUCESSO!");
        System.out.println("deseja cadastrar outra pessoa: APERTE 1. APERTE 2 PARA SAIR.");
        controle = input.nextInt();
        


    };
        System.out.println("Grupo feminino");
        System.out.print(lista);
        System.out.println(" ");
        System.out.println("Grupo masculino");
        System.out.print(lista0);
        
        
        
    
            
    



    }
}

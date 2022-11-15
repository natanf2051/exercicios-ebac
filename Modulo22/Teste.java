import java.nio.file.DirectoryStream.Filter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Teste {
    

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<String> lista = new ArrayList<>();
        List<String> lista0= new ArrayList<>();
        
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
    

            //System.out.println("APENAS PESSOAS DO SEXO FEMININO");
            List<List<String>> list = Arrays.asList(lista);
            list.forEach(n -> {
                   if (sexo == masculino) {
                        lista.add(pessoa);
                        // System.out.println(lista0);
                   }else{
                    //System.out.println("APENAS PESSOAS DO SEXO MASCULINO");
                    lista0.add(pessoa);
                    //System.out.println(lista);
                   };
                 
            });
           //if(sexo == masculino){
           //    lista.add(pessoa + " - F");
           //}else{
           //    lista.add(pessoa + " - M");
           //};
            
           System.out.println("CADASTRO REALIZADO COM SUCESSO!");
           System.out.println("PARA CADASTRAR OUTRA PESSOA: APERTE 1 -- APERTE 2 PARA SAIR");
           controle = input.nextInt();
            
        

            System.out.println("APENAS PESSOAS DO SEXO FEMININO");
            System.out.println(lista);
            System.out.println("APENAS PESSOAS DO SEXO MASCULINO");
            System.out.println(lista0);
        }
    }
}    
        
    
    

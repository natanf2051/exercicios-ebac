import java.util.List;
import java.util.Scanner;


public class Main{



public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    
    int controle = 1;
    int controle2 = 1;

   
 while(controle == controle2){
    System.out.println("DIGITE SEUS DADOS, EX: 'NOME E SEXO: F ou M'");
    List<Pessoa> gente = new Pessoa().popularPessoa();
    System.out.println(gente);

    gente.stream().filter(Pessoa -> Pessoa.getSexo().equals("F")).forEach(t -> System.out.print(t));
   
   

    
   }

}
   

   
}  
    

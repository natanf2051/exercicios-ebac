package modulo11;

import java.util.ArrayList;
import java.util.List;

public class alunos {

   public static void main(String[] args) {

    
    List<dados> alunas = new ArrayList();
         System.out.println("********ALUNOS FEMININOS**********");
        dados aluno4 = new dados("jessica", 33, "feminino");
        dados aluno2 = new dados("clara", 16, "feminino");
        alunas.add(aluno2);
        alunas.add(aluno4);
        
        alunas.spliterator();
        System.out.println(alunas);
    List<dados> alunos = new ArrayList();
        System.out.println("********ALUNOS MASCULINOS*********");

    
         dados aluno = new dados("natan", 21, "masculino");

         dados aluno1 = new dados("jorge", 32, "masculino");

         alunos.add(aluno);
         alunos.add(aluno1);
         System.out.println(alunos);


         

   }
    
    
}

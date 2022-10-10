package TAREFA_CLASSES;

public class notas{

private int total;

//aqui esta o calculador da media das notas informadas.
public void setNotaFinal(String aluno, int n1, int n2, int n3, int n4){
    int nota = n1 + n2 + n3 + n4;
    this.total = total + nota/4;
    System.out.println(aluno + " obteve a media de " + total);
     
};    
//aqui diz se o aluno foi aprovado ou não.
public int getnotaFinal(){
   //se a media for maior ou igual a 7, o aluno esta aprovado!
    if(total >= 7){
       System.out.println("aluno aprovado!");
       //se a media for menor que 7 e maior que 5, o aluno esta em recuperação!
    }else if (total >= 5) {
       System.out.println("aluno em recuperação!");
       //se a media for menor que 5, o aluno esta reprovado!
    } else {
       System.out.println("aluno reprovado!");
    };
    return total;
   
};
}
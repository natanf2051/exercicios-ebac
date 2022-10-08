package modulo10;

public class notas{

private int total;


public void setNotaFinal(String aluno, int n1, int n2, int n3, int n4){
    int nota = n1 + n2 + n3 + n4;
    total = total + nota/4;
    System.out.println(aluno + " obteve a media de " + total);
     
};    

public int getnotaFinal(){
    if(total >= 7){
       System.out.println("aluno aprovado!");
    }else if (total >= 5) {
       System.out.println("aluno em recuperação!");
    } else {
       System.out.println("aluno reprovado!");
    };
    return total;
   
}
}
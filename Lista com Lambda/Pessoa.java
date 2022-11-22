import java.util.List;
import java.util.Scanner;

public class Pessoa{
Scanner input = new Scanner(System.in);

private String nome;
private String sexo;



public void setnome(String nome) {
    String name = input.next();
    this.nome = name;
}

public void setSexo(String sexo) {
    String sex = input.next();
    this.sexo = sex;
}

public Pessoa() {
  this.nome = nome;
  
  this.sexo = sexo;
}

public String getNome() {
    return nome;
}

public String getSexo() {
    return sexo;
}

public List<Pessoa> popularPessoa(){
    Pessoa pess = new Pessoa();
    
   System.out.print("digite seu nome: ");
   pess.setnome(nome);
   System.out.print("digite seu sexo: ");
   pess.setSexo(sexo);

    System.out.println("CADASTRE UMA SEGUNDA PESSOA");

   Pessoa pess1 = new Pessoa();
   System.out.print("digite seu nome: ");
   pess1.setnome(nome);
   System.out.print("digite seu sexo: ");
   pess1.setSexo(sexo);
 

   return List.of(pess, pess1);

}

@Override
public String toString() {
    return "Pessoa [nome=" + nome + ", sexo=" + sexo + "]";
}



}
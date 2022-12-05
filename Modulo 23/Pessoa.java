import java.util.List;
import java.util.Scanner;

public class Pessoa{
Scanner input = new Scanner(System.in);

private String nome;
private String sexo;



public void setnome(String nome) {
    this.nome = nome;
}

public void setSexo(String sexo) {
    
    this.sexo = sexo;
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
    
   //System.out.print("digite seu nome: ");
   pess.setnome("natan");
   //System.out.print("digite seu sexo: ");
   pess.setSexo("m");

   // System.out.println("CADASTRE UMA SEGUNDA PESSOA");

   Pessoa pess1 = new Pessoa();
  // System.out.print("digite seu nome: ");
   pess1.setnome("isla");
   //System.out.print("digite seu sexo: ");
   pess1.setSexo("f");
 

   Pessoa pess2 = new Pessoa();
    pess2.setnome("Chico");
    pess2.setSexo("m");

   Pessoa pess3 = new Pessoa();
    pess3.setnome("Maria");
    pess3.setSexo("f");

   Pessoa pess4 = new Pessoa();
    pess4.setnome("Jose");
    pess4.setSexo("m");

   return List.of(pess, pess1, pess2, pess3, pess4);

}

@Override
public String toString() {
    return "Pessoa [nome=" + nome + ", sexo=" + sexo + "]";
}



}
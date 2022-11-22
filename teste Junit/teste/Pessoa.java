import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

import org.junit.Test;

public class Pessoa{
Scanner input = new Scanner(System.in);

private String nome = "natan";
private String sexo = "f";

public Pessoa(String nome, String sexo) {
    this.nome = nome;
    
    this.sexo = sexo;
  }
  

public void setnome(String nome) {
    //String name = input.next();
    this.nome = nome;
}

public void setSexo(String sexo) {
    //String sex = input.next();
    this.sexo = sexo;
}

public String getNome() {
    return nome;
}

public String getSexo() {
    return sexo;
}

public List<Pessoa> popularPessoa(){
    Pessoa pess = new Pessoa("Isla", "f");
    Pessoa pess1 = new Pessoa("Natan", "m");
    Pessoa pess2 = new Pessoa("jose", "m");
    
//  System.out.print("digite seu nome: ");
//  pess.setnome(nome);
//  System.out.print("digite seu sexo: ");
//  pess.setSexo(sexo);
//
//   System.out.println("CADASTRE UMA SEGUNDA PESSOA");
//
  // Pessoa pess1 = new Pessoa();
  // System.out.print("digite seu nome: ");
  // pess1.setnome(nome);
  // System.out.print("digite seu sexo: ");
  // pess1.setSexo(sexo);
 

   return List.of(pess, pess1, pess2);

}

@Override
public String toString() {
    return "Pessoa: nome= " + nome + ", sexo= " + sexo ;
}


public Stream stream() {
    return null;
}



}
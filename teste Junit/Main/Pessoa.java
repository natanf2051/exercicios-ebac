package Main;
import java.util.Scanner;

public class Pessoa{

private String nome;
private String sexo;
Scanner input = new Scanner(System.in);

//public Pessoa (String nome, String sexo){
//    String name = input.next();
//    this.nome = name;
//    String sex = input.next();
//    this.sexo = sex;
//
//}

public String getNome() {
    return nome + " " + sexo;
}

public String getSexo() {
    return sexo;
}




public void setDados(String nome, String sexo){
    String name = input.next();
    this.nome = name;
    String sex = input.next();
    this.sexo = sex;
}

@Override
public String toString() {
    return "Pessoa [nome= " + nome + ", sexo= " + sexo + "]";
}

}
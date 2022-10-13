package modulo13;

import java.text.Format;
import java.util.HashSet;
import java.util.Set;

abstract class pessoa{

    private Set<fisica> fisica;
    private Set<juridica> juridica;

    private String nome;
    private String cidade;
    private String telefone;
    


    public pessoa(){
        this.fisica = new HashSet<>();
        this.juridica = new HashSet<>();
    }

    public void add(fisica F){
        this.fisica.add(F);
    }

    public void add(juridica J){
        this.juridica.add(J);
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCidade() {
        return cidade;
    }
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

@Override
public String toString() {
    // TODO Auto-generated method stub
    return "Nome: " + this.nome + " cidade: " + this.cidade
    + " telefone: " + this.telefone;
}

}

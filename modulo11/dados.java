package modulo11;



public class dados {

    private String nome;
    private int idade;
    private String sexo;

    public dados(String nome, int idade, String sexo){
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
    }

    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public String getSexo() {
        return sexo;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }


    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Nome: " + nome + " Idade: " + idade + " Genero: " + sexo;    
    }


    public String[] split(String string) {
        return null;
    }
    
}

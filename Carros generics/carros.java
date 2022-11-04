public abstract class carros{

    private String nome;
    private String marca;
    private int ano;

    public carros(String nome, String marca, int ano){
        this.nome = nome;
        this.marca = marca;
        this.ano = ano;
    }
    


    @Override
    public String toString() {
        return "carros [nome= " + nome + ", marca= " + marca + ", ano= " + ano + "]";
    }
    
}
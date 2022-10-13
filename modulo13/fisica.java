package modulo13;

public class fisica extends pessoa{
    
    private String cpf;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
        
    }

    public void imprimePessoaFisica(){
        System.out.println("Nome: " + this.getNome() + " cpf: " + this.getCpf() + " cidade: " + this.getCidade()
        + " telefone: " + this.getTelefone());
    }
}

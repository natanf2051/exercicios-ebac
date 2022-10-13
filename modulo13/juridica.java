package modulo13;

public class juridica extends pessoa{
    
    private String cnpj;

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
    
    public void imprimePessoaJuridica(){
        System.out.println("Nome: " + this.getNome() + " cpf: " + this.getCnpj() + " cidade: " + this.getCidade()
        + " telefone: " + this.getTelefone());
    }

}

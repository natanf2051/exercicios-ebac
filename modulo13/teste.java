package modulo13;

public class teste {
    
public static void main(String[] args) {
    fisica fisica = new fisica();
    fisica.setNome("natan");
    fisica.setCpf("123456789");
    fisica.setCidade("sao paulo");
    fisica.setTelefone("11990586425");

    fisica.imprimePessoaFisica();

     fisica.add(fisica);

     juridica juridica = new juridica();
     juridica.setNome("arthur kalled");
     juridica.setCnpj("123456789/222");
     juridica.setCidade("goiania");
     juridica.setTelefone("67999823235");

     juridica.imprimePessoaJuridica();

     juridica.add(juridica);



}


}

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.Assert;
import org.junit.Test;

public class ExtratorListaFeminino{

    public List<Pessoa> todasAsPessoa;
    

    public ExtratorListaFeminino(List<Pessoa> todasAsPessoas) {
        this.todasAsPessoa = todasAsPessoas;
    }
    
    public List<Pessoa> listaMulher(){
       List<Pessoa> listaMulheres = todasAsPessoa.stream().filter(todasAsPessoas -> todasAsPessoas.getSexo().equals("f")).collect(Collectors.toList());
       //this.todasAsPessoa = listaMulheres;
       listaMulheres.forEach(s -> System.out.println(s));
       
        return listaMulheres;
     }

        
}
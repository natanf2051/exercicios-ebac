package src.Main;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "tb_produto")
public class Produto{

@Id
@GeneratedValue(strategy=GenerationType.AUTO, generator = "produto_seq")
@SequenceGenerator(name="produto_seq", sequenceName = "sq_produto", initialValue = 1, allocationSize = 1)
private Long id;

@Column(name = "nome", length = 100, nullable = false)
private String nome;

@Column(name = "valor", length = 10, nullable = false, unique = true)
private Integer valor;

public Long getId() {
    return id;
}

public void setId(Long id) {
    this.id = id;
}

public String getNome() {
    return nome;
}

public void setNome(String nome) {
    this.nome = nome;
}

public Integer getValor() {
    return valor;
}

public void setValor(Integer valor) {
    this.valor = valor;
}


}
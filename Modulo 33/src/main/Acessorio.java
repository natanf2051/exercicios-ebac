package main;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;


@Entity
@Table(name = "tb_acessorio")
public class Acessorio {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "acessorio_sq")
    @SequenceGenerator(name = "acessorio_sq", sequenceName = "sq_acessorio", initialValue = 1, allocationSize = 1)
    private Long id;

    @Column(name = "CODIGO", length = 10, nullable = false, unique = true)
	private String codigo;

    @Column(name = "plus", length = 50, nullable = false)
    private String plus;
    

    @OneToMany(mappedBy = "acessorio")
    private List<Carro> carrosA;

  
    
    public List<Carro> getCarrosA() {
        return carrosA;
    }

    public void setCarrosA(List<Carro> carrosA) {
        this.carrosA = carrosA;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPlus() {
        return plus;
    }

    public void setPlus(String plus) {
        this.plus = plus;
    }
    
}

package main;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.ForeignKey;

@Entity
@Table(name = "tb_carro")
public class Carro {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "carro_sq")
    @SequenceGenerator(name = "carro_sq", sequenceName = "sq_carro", initialValue = 1, allocationSize = 1)
    private Long id;

    @Column(name = "CODIGO", length = 10, nullable = false, unique = true)
	private String codigo;

    @Column(name = "nome", length = 50, nullable = false)
    private String nome;

    @Column(name = "combustivel", length = 50, nullable = false)
    private String combustivel;

    @ManyToOne
    @JoinColumn(name = "id_carro_fk", 
    foreignKey = @ForeignKey(name = "fk_carro_marca"),
    referencedColumnName = "id", nullable = false)
    private Marca marca;

    @ManyToOne
    @JoinColumn(name = "id_acessorio_fk", 
    foreignKey = @ForeignKey(name = "fk_carro_acessorio_fk"),
    referencedColumnName = "id", nullable = false)
    private Acessorio acessorio;


    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    
    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }

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

    public String getCombustivel() {
        return combustivel;
    }

    public void setCombustivel(String combustivel) {
        this.combustivel = combustivel;
    }

    public Acessorio getAcessorio() {
        return acessorio;
    }

    public void setAcessorio(Acessorio acessorio) {
        this.acessorio = acessorio;
    }


}

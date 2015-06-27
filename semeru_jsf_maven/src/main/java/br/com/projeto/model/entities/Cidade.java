package br.com.projeto.model.entities;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import org.hibernate.annotations.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Raildo
 */
@Entity
@Table(name="cidade")
public class Cidade implements Serializable {
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue
    @Column(name="IdCidade", nullable = false)
    private Integer idCidadef;
    @Column(name = "Nome", length = 80, nullable = false)
    private String nome;

    @OneToMany
    @ForeignKey(name = "CidadeEndereco")
    private List<Endereco> enderecos;
    
    public Cidade() {
    }

    public Integer getIdCidadef() {
        return idCidadef;
    }

    public void setIdCidadef(Integer idCidadef) {
        this.idCidadef = idCidadef;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    
    
}

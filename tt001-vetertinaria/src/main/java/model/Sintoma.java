package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Sintoma {
  
    @Id @GeneratedValue
    private Integer id; 
    @Column(name = "descricao")
    private String descricao; 
    @Column(name = "dias")
    private Integer dias;
    @Column(name = "gravidade")
    private String gravidade; 

    public Sintoma(String descricao, Integer dias, String gravidade) {
        this.descricao = descricao;
        this.dias = dias;
        this.gravidade = gravidade;
    }

    public Integer getId() {
        return id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Integer getDias() {
        return dias;
    }

    public void setDias(Integer dias) {
        this.dias = dias;
    }

    public String getGravidade() {
        return gravidade;
    }

    public void setGravidade(String gravidade) {
        this.gravidade = gravidade;
    }
    
    
}

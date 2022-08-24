package model;
import java.io.Serializable;
import javax.persistence.*;

@Entity
public class Especie implements Serializable {
    
    @Id @GeneratedValue
   private Integer id; 
    
    @Column(name = "descricao")
    String descricao;
    public Especie ()
    {
        
    }

    public Especie(Integer id, String descricao) {
        this.id = id;
        this.descricao = descricao;
    }
    
    
    public Especie(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    
    
    
    
    
}

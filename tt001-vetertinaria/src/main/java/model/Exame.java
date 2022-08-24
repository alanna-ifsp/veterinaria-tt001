package model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Exame {
    
   @Id
   private Integer id; 
   private String descricao; 

    public Exame(String descricao) {
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
    
    
    
}

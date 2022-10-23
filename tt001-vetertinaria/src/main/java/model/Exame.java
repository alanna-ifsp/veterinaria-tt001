package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Exame {
   
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   @Id
   private Integer id; 
   private String descricao; 
   private String resultado; 
   
   @ManyToOne
   @JoinColumn(name = "id_tratamento")
   
   private Tratamento tratamento; 

    public Exame() {
    }

   
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

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }

    public Tratamento getTratamento() {
        return tratamento;
    }

    public void setTratamento(Tratamento tratamento) {
        this.tratamento = tratamento;
    }

    @Override
    public String toString() {
        return "Exame{" + "id=" + id + ", descricao=" + descricao + ", resultado=" + resultado + ", tratamento=" + tratamento + '}';
    }
    
    
    
    
    
}

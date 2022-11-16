package model;

import java.sql.Date;
import java.time.LocalDate;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Tratamento {
    
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Integer id;
    @Column(name = "descricao")
    private String descricao;
    @Column(name = "data_hora_inicio")
    private LocalDate dataHoraInicial;
    @Column(name = "data_hora_fim")
    private LocalDate dataHoraFinal; 
    @Column(name = "sintomas")
    private String sintomas; 
    
    @ManyToOne(optional = true)
    @JoinColumn(name = "id_animal", referencedColumnName ="id")
    private Animal animal;
    
    public Tratamento ()
    {
        
    }

    public Tratamento(String descricao, LocalDate dataHoraInicial, LocalDate dataHoraFinal, String sintomas) {
        this.descricao = descricao;
        this.dataHoraInicial = dataHoraInicial;
        this.dataHoraFinal = dataHoraFinal;
        this.sintomas = sintomas;
    }
    
    public Integer getId()
    {
        return id;
    }
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDate getDataHoraInicial() {
        return dataHoraInicial;
    }

    public void setDataHoraInicial(LocalDate dataHoraInicial) {
        this.dataHoraInicial = dataHoraInicial;
    }

    public LocalDate getDataHoraFinal() {
        return dataHoraFinal;
    }

    public void setDataHoraFinal(LocalDate dataHoraFinal) {
        this.dataHoraFinal = dataHoraFinal;
    }

    public String getSintomas() {
        return sintomas;
    }

    public void setSintomas(String sintomas) {
        this.sintomas = sintomas;
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {

        this.animal = animal;
    }

    @Override
    public String toString() {
        return "Tratamento{" + "id=" + id + ", descricao=" + descricao + ", dataHoraInicial=" + dataHoraInicial + ", dataHoraFinal=" + dataHoraFinal + ", sintomas=" + sintomas + ", animal=" + animal + '}';
    }
    
    
   
  
    
}

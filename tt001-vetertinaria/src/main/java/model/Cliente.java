package model;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;


@Entity
public class Cliente extends Pessoa implements Serializable {
    
    @OneToMany
    private List<Animal> animais;
    @Column(name = "ativo")
    private Boolean ativo;

    public Cliente() {
    }

    public Cliente(List<Animal> animais, Boolean ativo, Integer id, String nome, LocalDate dataNascimento, String telefone, String email, String cpf, Endereco endereco) {
        super(id, nome, dataNascimento, telefone, email, cpf, endereco);
        this.animais = animais;
        this.ativo = ativo;
    }

    
    public List<Animal> getAnimais() {
        return animais;
    }

    public void setAnimais(List<Animal> animais) {
        this.animais = animais;
    }

    public Boolean getAtivo() {
        return ativo;
    }

    public void setAtivo(Boolean ativo) {
        this.ativo = ativo;
    }
 
    
    
    

   
    
 
}

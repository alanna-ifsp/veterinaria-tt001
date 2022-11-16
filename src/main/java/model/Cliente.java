package model;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.PrimaryKeyJoinColumn;

@Entity
@PrimaryKeyJoinColumn(name="id_pessoa")
public class Cliente extends Pessoa implements Serializable {
 
    @Column(name = "ativo")
    private String ativo;

    public Cliente() {
    }

    public Cliente(List<Animal> animais, String ativo, Integer id, String nome, LocalDate dataNascimento, String telefone, String email, String cpf,String endereco) {
        super(id, nome, dataNascimento, telefone, email, cpf,endereco);
    
        this.ativo = ativo;
    }

    public String getAtivo() {
        return ativo;
    }

    public void setAtivo(String ativo) {
        this.ativo = ativo;
    }

    @Override
    public String toString() {
        return "Cliente{" + "ativo=" + ativo + '}' + "Pessoa: " + "id=" + id + ", endereco=" + endereco + ", dataNascimento=" + dataNascimento + ", telefone=" + telefone + ", email=" + email + ", cpf=" + cpf + ", nome=" + nome;
    }


 
    
    
  
   
    
 
}

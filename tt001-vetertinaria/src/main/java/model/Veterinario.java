package model;

import java.io.Serializable;
import java.time.LocalDate;
import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Veterinario extends Pessoa implements Serializable {

private Integer idVeterinario; 
@Column(name = "crmv")
private String crmv;

    public Veterinario() {
    }

    public Veterinario(Integer idVeterinario, String crmv, Integer id, String nome, LocalDate dataNascimento, String telefone, String email, String cpf, Endereco endereco) {
        super(id, nome, dataNascimento, telefone, email, cpf, endereco);
        this.idVeterinario = idVeterinario;
        this.crmv = crmv;
    }

    public Integer getIdVeterinario() {
        return idVeterinario;
    }
    
    public String getCrmv() {
        return crmv;
    }

    public void setCrmv(String crmv) {
        this.crmv = crmv;
    }

  

    
}

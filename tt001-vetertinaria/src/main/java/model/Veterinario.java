package model;

import java.io.Serializable;
import java.time.LocalDate;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;


@Entity
@PrimaryKeyJoinColumn(name = "id_pessoa")
public class Veterinario extends Pessoa implements Serializable {
 
@Column(name = "crmv")
private String crmv;

    public Veterinario() {
    }

    public Veterinario(String crmv, Integer id, String nome, LocalDate dataNascimento, String telefone, String email, String cpf,String endereco) {
        super(id, nome, dataNascimento, telefone, email, cpf,endereco);
        this.crmv = crmv;
    }

    public Veterinario(String crmv) {
        this.crmv = crmv;
    }

    
    public String getCrmv() {
        return crmv;
    }

    public void setCrmv(String crmv) {
        this.crmv = crmv;
    }

  

    
}

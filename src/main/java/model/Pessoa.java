package model;

import java.io.Serializable;
import java.time.LocalDate;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Pessoa implements Serializable {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id 
    protected Integer id; 
    protected String endereco;
    @Column(name = "dt_nascimento")
    protected LocalDate dataNascimento;
    @Column(name = "telefone")
    protected String telefone;
    @Column(name = "email")
    protected String email;
    @Column(name = "cpf")
    protected String cpf;
    @Column(name = "nome")
    String nome;

    public Pessoa() {
    }
        
     public Pessoa(Integer id, String nome, LocalDate dataNascimento, String telefone, String email, String cpf,String endereco) {
            
        this.id = id;
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.telefone = telefone;
        this.email = email;
        this.cpf = cpf;
        this.endereco = endereco;
    }

    public Integer getId() {
        return id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }

    public String getEndereco() {
        return endereco;
    }
    
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return "Pessoa{" + "id=" + id + ", endereco=" + endereco + ", dataNascimento=" + dataNascimento + ", telefone=" + telefone + ", email=" + email + ", cpf=" + cpf + ", nome=" + nome + '}';
    }

    
    
    

    
    
    
}

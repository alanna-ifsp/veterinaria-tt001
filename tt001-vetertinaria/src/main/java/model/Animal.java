package model;

import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Animal implements Serializable {

@GeneratedValue(strategy = GenerationType.IDENTITY)
@Id 
private Integer id;
@Column(name = "nome")
private String nome; 
@Column(name = "idade")
private Integer idade; 
@Column(name = "sexo")
private String sexo;

@ManyToOne(cascade = CascadeType.ALL) 
@JoinColumn(name = "id_cliente")
Cliente cliente; 

@ManyToOne 
@JoinColumn(name = "id_especie")
Especie especie;

    public Especie getEspecie() {
        return especie;
    }

    public void setEspecie(Especie especie) {
        this.especie = especie;
    }

    public Animal() {
    }

    public Animal(Integer id, String nome, Integer idade, String sexo) {
        this.id = id;
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return "Animal{" + "id=" + id + ", nome=" + nome + ", idade=" + idade + ", sexo=" + sexo + '}';
    }
    
}

package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Endereco {

@Id @GeneratedValue
private Integer id;
@Column(name = "cep")
private String cep; 
@Column(name = "numero")
private String numero;
@Column (name = "complemento")
private String complemento; 

    public Endereco(Integer id, String cep, String numero, String complemento) {
        this.id = id;
        this.cep = cep;
        this.numero = numero;
        this.complemento = complemento;
    }

    public Integer getId() {
        return id;
    }

    public String getCep() {
        return cep;
    }

    public String getNumero() {
        return numero;
    }

    public String getComplemento() {
        return complemento;
    }




}

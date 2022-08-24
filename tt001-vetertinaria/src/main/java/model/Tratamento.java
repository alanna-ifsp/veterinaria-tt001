package model;

import java.time.LocalDate;


public class Tratamento {
    
    private String descricao;
    private String valor; 
    private LocalDate dataHoraInicial;
    private LocalDate dataHoraFinal; 
    
    public Tratamento ()
    {
        
    }
    public Tratamento(String descricao, String valor) {
        this.descricao = descricao;
        this.valor = valor;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
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
    
    
    
    
}

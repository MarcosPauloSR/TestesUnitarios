package br.com.ifgoiano.entidades;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Atividade {

    private Long id;
    private String nome;
    private String descricao;
    private String tipo;
    private BigDecimal preco;

    private List<Participante> participantes = new ArrayList<> (  );
    private List<BlocoHorario> blocosHorarios = new ArrayList<> (  );

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public BigDecimal getPreco() {
        return preco;
    }

    public void setPreco(BigDecimal preco) {
        this.preco = preco;
    }

    public List<Participante> getParticipantes() {
        return participantes;
    }

    public void setParticipantes(List<Participante> participantes) {
        this.participantes = participantes;
    }

    public List<BlocoHorario> getBlocosHorarios() {
        return blocosHorarios;
    }

    public void setBlocosHorarios(List<BlocoHorario> blocosHorarios) {
        this.blocosHorarios = blocosHorarios;
    }

}

package br.ufjf.dcc193.tbr01;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity


/**
 * Atividades
 */
public class Atividades {
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private Integer id;
    private String titulo;
    private String descricao;
    private Date dataInicio;
    private Date dataFim;
    private Double horasAssistencial;
    private Double horasJuridica;
    private Double horasFinanceira;
    private Double horasExecutiva;

    public Atividades(){}
    public Integer getId() {
        return id;
    }
    public Date getDataFim() {
        return dataFim;
    }
    public Date getDataInicio() {
        return dataInicio;
    }
    public String getDescricao() {
        return descricao;
    }
    public Double getHorasAssistencial() {
        return horasAssistencial;
    }
    public Double getHorasExecutiva() {
        return horasExecutiva;
    }
    public Double getHorasFinanceira() {
        return horasFinanceira;
    }
    public Double getHorasJuridica() {
        return horasJuridica;
    }
    public String getTitulo() {
        return titulo;
    }
    public Atividades setId(Integer id) {
        this.id = id;
        return this;
    }
    public Atividades setDataFim(Date dataFim) {
        this.dataFim = dataFim;
        return this;
    }
    public Atividades setDataInicio(Date dataInicio) {
        this.dataInicio = dataInicio;
        return this;
    }
    public Atividades setDescricao(String descricao) {
        this.descricao = descricao;
        return this;
    }
    public Atividades setHorasAssistencial(Double horasAssistencial) {
        this.horasAssistencial = horasAssistencial;
        return this;
    }
    public Atividades setHorasExecutiva(Double horasExecutiva) {
        this.horasExecutiva = horasExecutiva;
        return this;
    }
    public Atividades setHorasFinanceira(Double horasFinanceira) {
        this.horasFinanceira = horasFinanceira;
        return this;
    }
    public Atividades setHorasJuridica(Double horasJuridica) {
        this.horasJuridica = horasJuridica;
        return this;
    }
    public Atividades setTitulo(String titulo) {
        this.titulo = titulo;
        return this;
    }


    
}
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
    private Integer horasAssistencial;
    private Integer horasJuridica;
    private Integer horasFinanceira;
    private Integer horasExecutiva;
    private Integer idSede;


  /*  private Date dataInicio;
    private Date dataFim;
    */
    public Atividades(){}
    public Integer getId() {
        return id;
    }
    public Integer getIdSede() {
        return idSede;
    }
    public Atividades setIdSede(Integer idSede) {
        this.idSede = idSede;
        return this;
    }/*
    public Date getDataFim() {
        return dataFim;
    }
    public Date getDataInicio() {
        return dataInicio;
    }*/
    public String getDescricao() {
        return descricao;
    }
    public Integer getHorasAssistencial() {
        return horasAssistencial;
    }
    public Integer getHorasExecutiva() {
        return horasExecutiva;
    }
    public Integer getHorasFinanceira() {
        return horasFinanceira;
    }
    public Integer getHorasJuridica() {
        return horasJuridica;
    }
    public String getTitulo() {
        return titulo;
    }
    public Atividades setId(Integer id) {
        this.id = id;
        return this;
    }
    /*public Atividades setDataFim(Date dataFim) {
        this.dataFim = dataFim;
        return this;
    }
    public Atividades setDataInicio(Date dataInicio) {
        this.dataInicio = dataInicio;
        return this;
    }*/
    public Atividades setDescricao(String descricao) {
        this.descricao = descricao;
        return this;
    }
    public Atividades setHorasAssistencial(Integer horasAssistencial) {
        this.horasAssistencial = horasAssistencial;
        return this;
    }
    public Atividades setHorasExecutiva(Integer horasExecutiva) {
        this.horasExecutiva = horasExecutiva;
        return this;
    }
    public Atividades setHorasFinanceira(Integer horasFinanceira) {
        this.horasFinanceira = horasFinanceira;
        return this;
    }
    public Atividades setHorasJuridica(Integer horasJuridica) {
        this.horasJuridica = horasJuridica;
        return this;
    }
    public Atividades setTitulo(String titulo) {
        this.titulo = titulo;
        return this;
    }

    @Override
    public String toString() {
        return "id da atividade"+this.id+"---- titulo"
        +this.titulo+"-----chave estrangeira"+this.idSede;
    }
    
}
package br.ufjf.dcc193.tbr01;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity

/**
 * Membros
 */
public class Membros {
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)

    private int id;
    private String nome;
    private String funcao;
    private String email;
    private Date dataEntrada;
    private Date dataSaida;
    public Membros() {
    }
    public int getId() {
        return id;
    }
    public Date getDataEntrada() {
        return dataEntrada;
    }
    public Date getDataSaida() {
        return dataSaida;
    }
    public String getEmail() {
        return email;
    }
    public String getFuncao() {
        return funcao;
    }
    public String getNome() {
        return nome;
    }
    /**
     * @param id the id to set
     */
    public Membros setId(int id) {
        this.id = id;
        return this;
    }
    public Membros setDataEntrada(Date dataEntrada) {
        this.dataEntrada = dataEntrada;
        return this;
    }
    public Membros setDataSaida(Date dataSaida) {
        this.dataSaida = dataSaida;
        return this;
    }
    public Membros setEmail(String email) {
        this.email = email;
        return this;
    }
    public Membros setFuncao(String funcao) {
        this.funcao = funcao;
        return this;
    }
    public Membros setNome(String nome) {
        this.nome = nome;
        return this;
    }
}
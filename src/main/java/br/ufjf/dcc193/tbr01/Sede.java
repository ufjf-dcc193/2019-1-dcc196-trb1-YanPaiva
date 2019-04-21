package br.ufjf.dcc193.tbr01;

//import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity

/**
 * Sede
 */
public class Sede {
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private Integer id;
    private String nome;
    private String estado;
    private String cidade;
    private String bairro;
    private Integer telefone;
    private String endWeb;

    public Sede(){}
    public Integer getId() {
        return id;
    }
    public String getBairro() {
        return bairro;
    }
    public String getCidade() {
        return cidade;
    }
    public String getEndWeb() {
        return endWeb;
    }
    public String getEstado() {
        return estado;
    }
    public String getNome() {
        return nome;
    }
    public Integer getTelefone() {
        return telefone;
    }
    public Sede setId(Integer id) {
        this.id = id;
        return this;
    }
    
    public Sede setBairro(String bairro) {
        this.bairro = bairro;
        return this;
    }
    public Sede setCidade(String cidade) {
        this.cidade = cidade;
        return this;
    }
    public Sede setEndWeb(String endWeb) {
        this.endWeb = endWeb;
        return this;
    }
    public Sede setEstado(String estado) {
        this.estado = estado;
        return this;
    }
    
    public Sede setNome(String nome) {
        this.nome = nome;
        return this;
    }
    public Sede setTelefone(Integer telefone) {
        this.telefone = telefone;
        return this;
    }


}
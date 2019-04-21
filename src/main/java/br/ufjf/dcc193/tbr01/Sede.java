package br.ufjf.dcc193.tbr01;

import java.util.List;

/**
 * Sede
 */
public class Sede {
    private int id;
    private String nome;
    private String estado;
    private String cidade;
    private String bairro;
    private Integer telefone;
    private String endWeb;
    private List<Membros> funcionarios;
    private List<Atividades> atividades;

    public Sede(){}
    public int getId() {
        return id;
    }
    public List<Atividades> getAtividades() {
        return atividades;
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
    public List<Membros> getFuncionarios() {
        return funcionarios;
    }
    public String getNome() {
        return nome;
    }
    public Integer getTelefone() {
        return telefone;
    }
    public Sede setId(int id) {
        this.id = id;
        return this;
    }
    public Sede setAtividades(List<Atividades> atividades) {
        this.atividades = atividades;
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
    public Sede setFuncionarios(List<Membros> funcionarios) {
        this.funcionarios = funcionarios;
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
package com.example.nozes;

public class Task {
    private int id;
    private String titulo, prazo, descricao;
    private double custo;
    private Boolean chk;


    /*public Task(String titulo, String prazo, double custo, String descricao, Boolean chk){
        this.titulo = titulo;
        this.prazo = prazo;
        this.custo = custo;
        this.descricao = descricao;

        if (chk != false){
            this.chk = true;
        }
        else{
            this.chk = false;
        }
    }*/

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getPrazo() {
        return prazo;
    }

    public void setPrazo(String prazo) {
        this.prazo = prazo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getCusto() {
        return custo;
    }

    public void setCusto(double custo) {
        this.custo = custo;
    }

    public Boolean getChk() {
        return chk;
    }

    public void setChk(Boolean chk) {
        this.chk = chk;
    }
}
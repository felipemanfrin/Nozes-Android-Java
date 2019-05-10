package com.example.ehnozes;

public class Task {
    private String titulo, prazo;
    private Boolean chk;


    public Task(String titulo, String prazo, Boolean chk){
        this.titulo = titulo;
        this.prazo = prazo;
        if (chk != false){
            this.chk = true;
        }
        else{
            this.chk = false;
        }
    }

    public String getTitle() {
        return titulo;
    }

    public void setTitle(String titulo) {
        this.titulo = titulo;
    }

    public String getTerm() {
        return prazo;
    }

    public void setTerm(String prazo) {
        this.prazo = prazo;
    }

    public Boolean getChk() {
        return chk;
    }

    public void setChk(Boolean chk) {
        this.chk = chk;
    }
}
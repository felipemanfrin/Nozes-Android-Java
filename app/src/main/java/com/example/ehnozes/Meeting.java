package com.example.ehnozes;

public class Meeting {
    private String titulo, data, hora;

    public Meeting(String titulo, String data, String hora){
        this.titulo = titulo;
        this.data = data;
        this.hora = hora;
    }

    public String getTitle() {
        return titulo;
    }

    public void setTitle(String titulo) {
        this.titulo = titulo;
    }

    public String getDate() {
        return data;
    }

    public void setDate(String data) {
        this.data = data;
    }

    public String getHour() {
        return hora;
    }

    public void setHour(String hora) {
        this.hora = hora;
    }
}

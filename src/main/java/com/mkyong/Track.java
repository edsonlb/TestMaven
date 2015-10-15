package com.mkyong;

public class Track {

    String titulo;
    String banda;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getBanda() {
        return banda;
    }

    public void setBanda(String banda) {
        this.banda = banda;
    }

    @Override
    public String toString() {
        return "Track [title=" + getTitulo() + ", singer=" + getBanda() + "]";
    }

}
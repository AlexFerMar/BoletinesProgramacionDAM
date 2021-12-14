package com.DAM;

public class Multimedia {
    private String titulo;
    private String autor;
    private String formato;
    private int duracion;

    public Multimedia(String titulo, String autor, String formato, int duracion) {
        this.titulo = titulo;
        this.autor = autor;
        this.formato = formato;
        this.duracion = duracion;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getFormato() {
        return formato;
    }

    public int getDuracion() {
        return duracion;
    }

    @Override
    public String toString() {
        return
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", formato='" + formato + '\'' +
                ", duracion=" + duracion+ " minutos";
    }
}

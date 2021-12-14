package com.DAM1;

public class Publicacion {

    private String codigo;
    private String titulo;
    private int anhoPublicacion;

    public Publicacion(String codigo, String titulo, int anhoPublicacion) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.anhoPublicacion = anhoPublicacion;
    }



  @Override
    public String toString() {
        return "codigo='" + codigo + '\'' +
                ", titulo='" + titulo + '\'' +
                ", anhoPublicacion=" + anhoPublicacion;
    }


    public String getCodigo() {
        return codigo;
    }

    public int getAnhoPublicacion() {
        return anhoPublicacion;
    }
}

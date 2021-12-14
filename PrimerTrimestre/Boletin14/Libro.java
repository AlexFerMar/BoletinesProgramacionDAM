package com.DAM1;

public class Libro extends Publicacion {

    private boolean prestado=false;

    public Libro(String codigo, String titulo, int anhoPublicacion) {
        super(codigo, titulo, anhoPublicacion);
    }

    public void setPrestado(boolean prestado) {
        this.prestado = prestado;
    }

    @Override
    public String toString() {
        return "Libro{"+super.toString() +
                ",prestado=" + prestado+"}";
    }

}

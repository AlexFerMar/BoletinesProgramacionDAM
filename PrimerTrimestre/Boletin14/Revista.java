package com.DAM1;

public class Revista extends Publicacion{

    private int numero;


    public Revista(String codigo, String titulo, int anhoPublicacion, int numero) {
        super(codigo, titulo, anhoPublicacion);
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Revista{"+super.toString() +
                ",numero=" + numero+"}";
    }

}

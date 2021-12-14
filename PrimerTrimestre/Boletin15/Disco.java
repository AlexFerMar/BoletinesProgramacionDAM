package com.DAM;



public class Disco extends Multimedia {

    private String xenero;

    public Disco(String titulo, String autor, String formato, int duracion, String xenero) {
        super(titulo, autor, formato, duracion);
        this.xenero = xenero;
    }

    public String getXenero() {
        return xenero;
    }

    @Override
    public String toString() {
        return "Disco{" + super.toString()+
                ", xenero='" + xenero + '\'' +
                '}';
    }
}

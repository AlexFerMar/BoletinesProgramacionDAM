package com.DAM;

public class Película extends Multimedia{
    private String actorPrincipal;
    private String actrizPrincipal;

    public Película(String titulo, String autor, String formato, int duracion, String actorPrincipal, String actrizPrincipal) {
        super(titulo, autor, formato, duracion);
        this.actorPrincipal = actorPrincipal;
        this.actrizPrincipal = actrizPrincipal;
    }

    public String getActorPrincipal() {
        return actorPrincipal;
    }

    public String getActrizPrincipal() {
        return actrizPrincipal;
    }

    @Override
    public String toString() {
        return "Película{" + super.toString()+
                ", actorPrincipal='" + actorPrincipal + '\'' +
                ", actrizPrincipal='" + actrizPrincipal + '\'' +
                '}';
    }
}

package com.company;

public class Masajista extends SeleccionFutbol{

    private String titulacion;

    private Integer aniosExperiencia;

    public Masajista(Integer id, String nombre, String apellidos, Integer edad, String titulacion, Integer aniosExperiencia) {
        super(id, nombre, apellidos, edad);
        this.titulacion = titulacion;
        this.aniosExperiencia = aniosExperiencia;
    }

    public void darMasaje() {

        System.out.println("El masajista da un masaje");

    }

    @Override
    public void concentrarse() {

        System.out.println(this.getClass().getSimpleName()+" se concentra");

    }

    @Override
    public void viajar() {

        System.out.println(this.getClass().getSimpleName()+" viaja");

    }

    @Override
    public void entrenar() {

        System.out.println(this.getClass().getSimpleName()+" se entrena");

    }

    @Override
    public void jugarPartido() {

        System.out.println(this.getClass().getSimpleName()+" juega partido");

    }

    @Override
    public String toString() {
        return "Masajista{" +
                "titulacion='" + titulacion + '\'' +
                ", aniosExperiencia=" + aniosExperiencia +
                ", id=" + id +
                ", nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", edad=" + edad +
                '}';
    }
}

package com.company;

public class Futbolista extends SeleccionFutbol {

    public Integer dorsal;
    public String demarcacion;

    public Futbolista(Integer id, String nombre, String apellidos, Integer edad, Integer dorsal, String demarcacion) {
        super(id, nombre, apellidos, edad);
        this.dorsal = dorsal;
        this.demarcacion = demarcacion;
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
        return "Futbolista{" +
                "dorsal=" + dorsal +
                ", demarcacion='" + demarcacion + '\'' +
                ", id=" + id +
                ", nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", edad=" + edad +
                '}';
    }
}

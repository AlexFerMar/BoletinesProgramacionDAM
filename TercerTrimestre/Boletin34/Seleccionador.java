package com.company;

public class Seleccionador extends SeleccionFutbol {

    public Seleccionador(Integer id, String nombre, String apellidos, Integer edad) {
        super(id, nombre, apellidos, edad);
    }

    public void seleccionarXogador(){

        System.out.println(this.getClass().getSimpleName()+" selecciona Jugador");

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
        return "Seleccionador{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", edad=" + edad +
                '}';
    }
}

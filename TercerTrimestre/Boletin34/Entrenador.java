package com.company;

public class Entrenador extends SeleccionFutbol {

    private Integer idSeleccionaador;

    public Entrenador(Integer id, String nombre, String apellidos, Integer edad, Integer idSeleccionaador) {
        super(id, nombre, apellidos, edad);
        this.idSeleccionaador = idSeleccionaador;
    }

    public void planificarEntrenamiento() {

        System.out.println("Entrenador planifica entrenamiento");

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
        return "Entrenador{" +
                "idSeleccionaador=" + idSeleccionaador +
                ", id=" + id +
                ", nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", edad=" + edad +
                '}';
    }
}

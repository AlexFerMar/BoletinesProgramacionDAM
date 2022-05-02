package com.company;

public class Aplicacion {

    public static void main(String[] args) {
        Entrenador entrenador = new Entrenador(1, "a", "a a", 65, 4346);
        Futbolista futbolista = new Futbolista(1, "a", "a a", 65, 1, "Portero");
        Masajista masajista = new Masajista(1, "a", "a a", 25, "Titulacion", 15);
        Seleccionador seleccionador = new Seleccionador(1, "a", "a a", 65);

        System.out.println(entrenador);
        System.out.println();
        System.out.println(futbolista);
        System.out.println();
        System.out.println(masajista);
        System.out.println();
        System.out.println(seleccionador);
        System.out.println();
        entrenador.planificarEntrenamiento();
        System.out.println();
        futbolista.entrenar();
        System.out.println();
        masajista.darMasaje();
        System.out.println();
        seleccionador.concentrarse();

    }
}

package com.company;

public class Main {

    public static void main(String[] args) {


        String[] opciones={"Escribir notas","Ver Aprobados","Calcular Media","Ver nota mas alta","Salir"};

        int[] notas=new int[FuncionesArray.TAMAÑO_ARRAY];

        int seleccion=0;

        do {

            switch (FuncionesArray.simpleSelector("Escoge una accion", "Notas", opciones)) {

                case 0 -> {
                    notas = FuncionesArray.generateArray(FuncionesArray.TAMAÑO_ARRAY);
                }

                case 1 -> {
                    FuncionesArray.showMessage("El numero de aprobados es " + FuncionesArray.countAprobados(notas));
                }

                case 2 -> {
                    FuncionesArray.showMessage("La nota media de clase es " + FuncionesArray.floatFormat(FuncionesArray.calculateMedia(notas), 2));
                }

                case 3 -> {
                    FuncionesArray.showMessage("La nota mas alta es " + FuncionesArray.showMayor(notas));
                }

                default -> {
                    seleccion = -1;
                }
                
            }

        }while (seleccion == 0) ;
    }
}

package com.company;

public class Main {

    public static void main(String[] args) {


        String[] opciones={"Escribir notas","Ver notas","Buscar Nota de Alumno","Ver Aprobados","Calcular Media","Nota mas Alta","Ordenar Notas","Salir"};

        int[] notas=new int[FuncionesArray.TAMAÑO_ARRAY];
        String[] alumnos=new String[FuncionesArray.TAMAÑO_ARRAY];

        int seleccion=0;

        do {

            switch (FuncionesArray.simpleSelector("Escoge una accion", "Notas", opciones)) {

                case 0 -> {

                    Object[] alumNota=FuncionesArray.generateArrayNotas(notas.length);

                    alumnos = (String[]) alumNota[0];

                    notas = (int[]) alumNota[1];

                }
                case 1 -> {
                    FuncionesArray.showMessage( FuncionesArray.showClase(notas,alumnos));
                }

                case 2 -> {

                    FuncionesArray.showMessage( FuncionesArray.searchNota(notas,alumnos,FuncionesArray.askString("Introduce el nombre del alumno")));

                }

                case 3 -> {
                    FuncionesArray.showMessage( FuncionesArray.countAprobados(notas,alumnos));
                }

                case 4 -> {
                    FuncionesArray.showMessage("La nota media de clase es " + FuncionesArray.floatFormat(FuncionesArray.calculateMedia(notas), 2));
                }

                case 5 -> {
                    FuncionesArray.showMessage( FuncionesArray.showMayor(notas,alumnos));
                }

                case 6 -> {

                    Object[] alumNota=FuncionesArray.ordenarArray(notas,alumnos);

                    alumnos = (String[]) alumNota[0];

                    notas = (int[]) alumNota[1];

                }

                default -> {
                    seleccion = -1;
                }

            }

        }while (seleccion == 0) ;
    }
}
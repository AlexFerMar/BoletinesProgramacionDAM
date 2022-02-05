package com.company;

public class Main {

    public static void main(String[] args) {

        int seleccion=0;

        String[] jornadas=new String[10];

        String[] equipos=new String[10];

        int[][] goles=new int[10][10];


        do{

            seleccion=Funciones.simpleSelector("Escoje una oipcion","La Liga",Funciones.opciones);

        switch (seleccion) {

            case 0 -> {

                equipos=Funciones.generateEquipos(Funciones.EQUIPOS);

                jornadas=Funciones.generateJornadas(Funciones.JORNADAS);

                goles=Funciones.generateGoles(equipos,jornadas);

            }

            case 1 -> {

                Funciones.showArray(goles,equipos,jornadas);

            }

            case 2 -> {

                Funciones.sortEquipos(goles,equipos,jornadas);

            }

            case 3 -> {

                Funciones.searchMejorJornada(goles,equipos,jornadas);
            }

            case 4 -> {

                Funciones.searchMejor(goles,equipos,jornadas);

            }

            case 5 -> {

                Funciones.searchGoles(goles,equipos,jornadas);

            }


            default -> {

                seleccion=-1;

            }

        }

        }while(seleccion!=-1);




















    }
}

package com.company;

import javax.swing.*;
import java.util.Arrays;

public class Funciones {


    public static String[] opciones = {"Crear tabla", "Ver Tabla", "Ordenar por goles", "Mejor equipo por jornada", "El mejor equipo de toda la jornada", "Buscar goles por equipo y jornada", "Salir"};

    public static int EQUIPOS = 20;

    public static int JORNADAS = 36;

    //public static int MAX_GOLES = 15;


    public static String[] generateEquipos(int equipos) {

        String[] array = new String[equipos];

        for (int j = 0; j < array.length; j++) {

            array[j] = "Equipo" + String.format("%02d",(j + 1));

        }

        return array;
    }


    public static String[] generateJornadas(int jornadas) {

        String[] array = new String[jornadas];

        for (int j = 0; j < array.length; j++) {

            array[j] = "x" + String.format("%02d",(j + 1));

        }


        return array;
    }


    public static int[][] generateGoles(String[] equipos, String[] jornadas) {

        int[][] array = new int[equipos.length][jornadas.length];

        for (int i = 0; i < array.length; i++) {

            for (int j = 0; j < array[i].length; j++) {

                array[i][j] = getRandom2();

            }
        }


        return array;
    }


    public static void showArray(int[][] goles, String[] equipos, String[] jornadas) {

        String tabla = "|  Equipos  | ";

        for (int i = 0; i < jornadas.length; i++) {

            tabla += jornadas[i] + "  | ";

        }


        for (int i = 0; i < goles.length; i++) {

            tabla += "\n| " + equipos[i] + " | ";

            for (int j = 0; j < goles[i].length; j++) {

                tabla += " " + String.format("%03d", goles[i][j]) + " | ";

            }

        }

        showMessage(tabla);
    }

    public static void sortEquipos(int[][] goles, String[] equipos, String[] jornadas) {


        int[] golesTotales = new int[equipos.length];

        int[] numeroEquipos= new int[equipos.length];


        for (int i = 0; i < equipos.length; i++) {

            for (int j : goles[i]) {

                golesTotales[i] += j;

            }

            numeroEquipos[i]=i;

        }

        int mayor = golesTotales[0];

        for (int i = 0; i < equipos.length; i++) {

            for (int j = 0; j < equipos.length; j++)

                if (golesTotales[j] < golesTotales[i]) {

                    int auxiliargoles = golesTotales[i];

                    golesTotales[i] = golesTotales[j];

                    golesTotales[j] = auxiliargoles;

                   int auxiliarEquipo=numeroEquipos[i];

                   numeroEquipos[i]=numeroEquipos[j];

                   numeroEquipos[j]=auxiliarEquipo;


                }
        }

        System.out.println(Arrays.toString(numeroEquipos));
        //region tabla
        String tabla = "| Equipos | ";

        for (int i = 0; i < jornadas.length; i++) {

            tabla += jornadas[i] + "  | ";

        }

        tabla += " Total | ";

        for (int i = 0; i < goles.length; i++) {

            tabla += "\n| " + equipos[numeroEquipos[i]] + " | ";

            for (int j = 0; j < goles[i].length; j++) {

                tabla += " " + String.format("%03d", goles[numeroEquipos[i]][j]) + " | ";

            }

            tabla+= " " + String.format("%03d",golesTotales[i]) + " | ";


        }
        //endregion

        showMessage(tabla);

    }


    public static void searchMejorJornada(int[][] goles, String[] equipos, String[] jornadas) {

        int mayor = -1;

        int[] inEquipo = new int[JORNADAS];


        for (int i = 0; i < JORNADAS; i++) {

            mayor = -1;

            for (int j = 0; j <goles.length ; j++) {

                if (goles[j][i] > mayor) {


                    inEquipo[i] = j;


                    mayor = goles[j][i];


                }

            }

        }

        String mensaje = "";


        mensaje = "El equipo que marco mas goles, en las distintas jornadas fueron:";

        for (int i = 0; i < JORNADAS; i++) {

            mensaje += "\n--> En la jornada '" + jornadas[i] + "': El equipo \"" + equipos[inEquipo[i]] + "\" con " + goles[inEquipo[i]][i] + " goles";

        }

        showMessage(mensaje);

    }

    public static void searchMejor(int[][] goles, String[] equipos, String[] jornadas) {

        int mayor = -1;

        int[] inEquipo = new int[EQUIPOS * JORNADAS];

        int[] inJornada = new int[EQUIPOS * JORNADAS];

        int contadorEquipo = 0;

        int contadorJornada = 0;


        for (int i = 0; i < goles.length; i++) {

            for (int j = 0; j < goles[i].length; j++) {


                if (goles[i][j] > mayor) {

                    //Esto reinicia la array
                    inEquipo = new int[EQUIPOS * JORNADAS];

                    inJornada = new int[EQUIPOS * JORNADAS];

                    //Esto selecciona un nuevo maximo
                    mayor = goles[i][j];

                    //Esto guarda el equipo
                    contadorEquipo = 0;

                    inEquipo[contadorEquipo] = i;

                    //Esto guarda la jornada
                    contadorJornada = 0;

                    inJornada[contadorJornada] = j;

                } else if (goles[i][j] == mayor) {

                    contadorEquipo++;

                    contadorJornada++;


                    inEquipo[contadorEquipo] = i;

                    inJornada[contadorJornada] = j;

                }

            }

        }

        String mensaje = "";

        if (contadorEquipo > 0) {

            mensaje = "Los equipos que marcaron mas goles, con " + mayor + " goles fueron:";

            for (int i = 0; i < contadorEquipo + 1; i++) {

                mensaje += "\n-->" + equipos[inEquipo[i]] + ": En la jornada '" + jornadas[inJornada[i]] + "'";

            }

        } else
            mensaje = " El equipo que marco mas goles fue " + equipos[inEquipo[0]] + ", con " + mayor + " goles en toda la jornada '" + jornadas[inJornada[0]] + "'";


        showMessage(mensaje);

    }

    public static void searchGoles(int[][] goles, String[] equipos, String[] jornadas) {

        if (equipos[0]==null) showMessage("Crea antes una tabla de equipo, porfavor");

        else {

            int nEquipo = simpleSelector("Escoje un equipo", "Equipos", equipos);

            int nJornada = simpleSelector("Escoje una jornada", "Equipos", jornadas);

            if (nEquipo==-1 ||nJornada==-1) return;

            showMessage("El equipo '" + equipos[nEquipo] + "' marco " + goles[nEquipo][nJornada] + " goles en la jornada '" + jornadas[nJornada] + "'");

        }
    }

    public static int askInt(String mensaje) {

        return Integer.parseInt(JOptionPane.showInputDialog(mensaje));
    }

    public static String askString(String mensaje) {

        return JOptionPane.showInputDialog(mensaje);
    }


    public static int simpleSelector(String mensaje, String titulo, String[] opciones) {

        return JOptionPane.showOptionDialog(null, mensaje, titulo,
                JOptionPane.YES_NO_CANCEL_OPTION, 0, null, opciones, -1);
    }


    //Generacion de goles aleatorizada de tal forma que cuanto mas goles mas dificil que aumente el contador
    public static int getRandom2() {

        int goles=0;

        while((int) (Math.random()*4)!=0){

            goles++;

        }

        if (goles==0)  goles= (int) (Math.random()*3);

        return goles;

    }

    public static void showMessage(String mensaje) {

        JOptionPane.showMessageDialog(null, mensaje);

    }


}

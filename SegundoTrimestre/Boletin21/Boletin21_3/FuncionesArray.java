package com.company;

import javax.swing.*;
import java.text.DecimalFormat;


public class FuncionesArray {

    public final static int TAMAÑO_ARRAY = 30;


    public static Object[] generateArrayNotas(int tamaño) {

        String[] alumnos=new String[tamaño];
        int[] notas = new int[tamaño];

        for (int i = 0; i < tamaño; i++) {

            alumnos[i]=askString("Introduce el nombre del alumno");
            notas[i] = askNota();

        }

        return new Object[]{alumnos, notas};
    }

    public static int askNota() {
        int nota = askInt("Introduce una nota");

        while (nota < 0 || nota > 10) {

            nota = askInt("Nota no valida, introduce una nota del 0 al 10.");

        }

        return nota;
    }

    public static int askInt(String mensaje) {

        return Integer.parseInt(JOptionPane.showInputDialog(mensaje));
    }

    public static String askString(String mensaje) {

        return JOptionPane.showInputDialog(mensaje);
    }

    public static String countAprobados(int[] notas,String[] alumnos ) {

        String aprobados="Los alumnos aprobados son:";

        for (int i = 0; i < notas.length; i++) {

            if (notas[i] > 5f) aprobados+="\n->"+alumnos[i] +": "+ notas[i];
        }

        return aprobados;
    }

    public static float calculateMedia(int[] array) {

        float media = 0;
        for (int i = 0; i < array.length; i++) {

            media += array[i];
        }

        return media / array.length;
    }


    public static String showMayor(int[] notas,String[] alumno) {

        int mayor = notas[0];
        String nombre=alumno[0];
        String mejor="La mayor nota de clase es de ";


        for (int i = 1; i < notas.length; i++) {

            if (notas[i] > mayor){
                mayor = notas[i];
                nombre=alumno[i];
            }
        }

        mejor+= nombre +".Con la nota: "+ mayor;

        return mejor;
    }

    public static void showMessage(String mensaje) {

        JOptionPane.showMessageDialog(null, mensaje);

    }

    public static int simpleSelector(String mensaje, String titulo, String[] opciones) {

        return JOptionPane.showOptionDialog(null, mensaje, titulo,
                JOptionPane.YES_NO_CANCEL_OPTION, 0, null, opciones, -1);
    }

    public static String floatFormat(float number, int nDecimal) {

        String decimal = "0.";

        for (int i = 0; i < nDecimal; i++) {
            decimal += 0;
        }

        DecimalFormat dc = new DecimalFormat(decimal);

        return dc.format(number);

    }
    public static Object[] ordenarArray(int[] notas,String[] alumnos) {

        for (int i = 0; i < notas.length; i++) {

            for (int j = 0; j < notas.length; j++)

                if (notas[j] > notas[i]) {

                    int auxiliarNotas = notas[i];

                    notas[i] = notas[j];

                    notas[j] = auxiliarNotas;

                    String auxiliarAlumnos = alumnos[i];

                    alumnos[i] = alumnos[j];

                    alumnos[j] = auxiliarAlumnos;

                }

        }

        return new Object[]{alumnos, notas};
    }

    public static String showClase(int[] notas,String[] alumnos ) {

        String aprobados="Los alumnos con sus notas son:";

        for (int i = 0; i < notas.length; i++) {

            aprobados+="\n->"+alumnos[i] +": "+ notas[i];
        }

        return aprobados;
    }

    public static String searchNota(int[] notas,String[] alumnos,String nombre){

        int nota= -1;
        for (int i = 0; i < alumnos.length; i++) {

            if (nombre.equals(alumnos[i])) nota = notas[i];
        }

        if(nota==-1) return "El alumno "+nombre+ " no figura en la lista";

        return  "El alumno "+nombre+ " tiene una nota de "+ nota;
    }



}

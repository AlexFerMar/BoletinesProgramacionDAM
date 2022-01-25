package com.company;

import javax.swing.*;
import java.text.DecimalFormat;

public class FuncionesArray {


    public final static int TAMAÑO_ARRAY = 30;


    public static int[] generateArray(int tamaño) {

        int[] array = new int[tamaño];

        for (int i = 0; i < tamaño; i++) {

            array[i] = askNota();

        }

        return array;
    }


    public static int countAprobados(int[] array) {

        int aprobados = 0;

        for (int i = 0; i < array.length; i++) {

            if (array[i] > 5f) aprobados++;
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


    public static int showMayor(int[] array) {

        int mayor = array[0];
        for (int i = 1; i < array.length; i++) {

            if (array[i] > mayor) mayor = array[i];
        }

        return mayor;
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

    public static String floatFormat(float number, int nDecimal) {

        String decimal = "0.";

        for (int i = 0; i < nDecimal; i++) {
            decimal += 0;
        }

        DecimalFormat dc = new DecimalFormat(decimal);

        return dc.format(number);

    }


    public static void showMessage(String mensaje) {

        JOptionPane.showMessageDialog(null, mensaje);

    }

    public static int simpleSelector(String mensaje, String titulo, String[] opciones) {

        return JOptionPane.showOptionDialog(null, mensaje, titulo,
                JOptionPane.YES_NO_CANCEL_OPTION, 0, null, opciones, -1);
    }
}

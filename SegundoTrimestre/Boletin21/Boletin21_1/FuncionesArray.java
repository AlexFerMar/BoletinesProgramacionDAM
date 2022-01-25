package com.company;

import javax.swing.*;
import java.util.Arrays;

public class FuncionesArray {

    public static final int TAMAÑO_ARRAY=6;


    public static int[] generateArray(int tamaño){

        int[] numeros=new int[tamaño];

        for (int i=0;i<numeros.length;i++){
            numeros[i]=(int)(Math.random()*50)+1;
        }

        return numeros;
    }

    public static void showArray(int[] numeros) {

        int[] array = new int[numeros.length];

        for (int i = numeros.length-1; i >-1; i--) {
            array[numeros.length-i-1]=numeros[i];
        }
        JOptionPane.showMessageDialog(null, "Array al derecho: "+Arrays.toString(numeros));
        JOptionPane.showMessageDialog(null,"Array al reves: " +Arrays.toString(array));


    }



}

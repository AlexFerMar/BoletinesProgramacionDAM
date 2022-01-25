package com.company;

import javax.swing.*;

public class FuncionesArray {

    public static int askDni(){

        int dni=askInt("Introduce el dni");
        int longitud= String.valueOf(dni).length();
        while(longitud !=8){

             dni=askInt("Formato invalido, el DNI debe estar compuesto por 8 cifras");
             longitud= String.valueOf(dni).length();
        }

        return dni;
    }


    public static int calculateResto(int dni){

        return dni%23;
    }

    public static int askInt(String mensaje) {

        return Integer.parseInt(JOptionPane.showInputDialog(mensaje));
    }


    public static String searchLetra(int resto){

        String[] letras={"A","B","C","D","E","F","G","H","J","K","L","M","N","P","Q","R","S","T","V","W","X","Y","Z"};
        int[] numeros={3,11,20,9,22,7,4,18,13,21,19,5,12,8,16,1,15,0,17,2,10,6,14};

        String letra=null;
        for (int i = 0; i < numeros.length; i++) {

            if (resto==numeros[i]) letra = letras[i];
        }

        return  letra;
    }

    public static void showMessage(String mensaje) {

        JOptionPane.showMessageDialog(null, mensaje);

    }
}

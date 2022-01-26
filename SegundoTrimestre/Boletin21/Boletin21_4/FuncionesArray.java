package com.company;

import javax.swing.*;
import LibreriaAlex.*;

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


    public static char searchLetra(int resto){

        char[] letras={'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};

        return  letras[resto];
    }

    public static void showMessage(String mensaje) {

        JOptionPane.showMessageDialog(null, mensaje);

    }
}

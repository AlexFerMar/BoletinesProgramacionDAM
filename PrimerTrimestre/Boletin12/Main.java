package com.DAM;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        String[] opciones = {"Registrar Coche", "Retirar Coche"};
        int selecion = 0;
        while (selecion != 3) {
            selecion = JOptionPane.showOptionDialog(null, "Escoje la operacion a realizar", "Bienvenido al Parking",
                    JOptionPane.WARNING_MESSAGE, 0, null, opciones, opciones[1]);
            switch (selecion) {
                case 0:

                    Parking.registerCoche();
                    break;

                case 1:

                    Parking.payCoche();
                     break;

                default:
                    selecion=3;
                    break;
            }
        }
    }
}


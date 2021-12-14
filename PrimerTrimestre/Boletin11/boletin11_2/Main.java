package com.DAM;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        String[] opciones = {"Facil", "Normal", "Dificil"};
        int selecion = 0;
        while (selecion != 3) {
            selecion = JOptionPane.showOptionDialog(null, "Escoje la dificultad", "Adivina el numero",
                    JOptionPane.WARNING_MESSAGE, 0, null, opciones, opciones[2]);
            switch (selecion) {
                case 0:
                    Aleatorio.generateRandom(10);
                    break;
                case 1:
                    Aleatorio.generateRandom(5);
                    break;
                case 2:
                    Aleatorio.generateRandom(3);
                    break;
                default:
                    selecion=3;
                    break;
            }
        }
    }
}

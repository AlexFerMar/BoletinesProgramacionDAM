package com.company;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        String[] opciones = {"Introducir Base", "Introducir Altura", "Calcular Area", "Cancelar"};
        Rectangulo rectangulo = new Rectangulo();
        int selecion = 0;
        while (selecion != 3) {
            selecion = JOptionPane.showOptionDialog(null, "Escoje la accion a realizar", "Calcular area Rectangulo",
                    JOptionPane.WARNING_MESSAGE, 0, null, opciones, opciones[3]);
            switch (selecion) {
                case 0:
                    rectangulo.askBase();
                    break;

                case 1:
                    rectangulo.askAltura();
                    break;

                case 2:
                    rectangulo.calcularArea();
                    break;
                default:
                    break;
            }
        }
    }
}
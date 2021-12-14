package com.DAM1;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        String[] opciones = {"Introducir sueldos", "Cantidad sueldo", "Porcentaje Sueldo", "Borrar Memoria", "Cancelar"};
        Sueldos sueldos = new Sueldos();
        int seleccion = 0;
        while (seleccion != 4) {
            seleccion = JOptionPane.showOptionDialog(null, "Escoje la accion a realizar", "Lista sueldos",
                    JOptionPane.WARNING_MESSAGE, 0, null, opciones, opciones[4]);
            switch (seleccion) {
                case 0:
                    sueldos.askSueldo();
                    break;

                case 1:
                    sueldos.showSueldos();
                    break;
                case 2:
                    sueldos.calculateSueldo();
                    break;

                case 3:
                    sueldos.setSueldoAlto(0);
                    sueldos.setSueldoMedio(0);
                    sueldos.setSueldoBajo(0);
                    sueldos.setNumeroTrabajadores(0);
                    break;

                default:
                    seleccion = 4;
                    break;
            }
        }
    }
}

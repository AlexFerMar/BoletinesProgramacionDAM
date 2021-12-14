package com.company;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        /*Esto es un array de string, en ella pongo las opciones a seleccionar.
        Las opciones del array van de 0 a n, y cuando selecciono una devuelve el valor de su posicion.
        Pongo la array como seleccionable y asi me salen todos sus integrantes como opciones y, cuando escojo 1,
        me devuelve un valor numero que luego le paso al switch para elegir la clase que quiero ejecutar
         */
        String[] opciones = {"Triangulo", "Cuadrado", "Circulo", "Cancelar"};
        int selecion = JOptionPane.showOptionDialog(null, "Elige la forma para calcular el area", "Calculadora de areas",
                JOptionPane.WARNING_MESSAGE, 0,null , opciones, opciones[3]);

        switch (selecion) {
            case 0:
                Triangulo triangulo=new Triangulo(Double.parseDouble(JOptionPane.showInputDialog(null,"Introduce la base del triangulo",0)),
                        Double.parseDouble(JOptionPane.showInputDialog(null,"Introduce la altura del triangulo",0)));

                triangulo.calcularArea();
                break;

            case 1:
                Cuadrado cuadrado=new Cuadrado(Double.parseDouble(JOptionPane.showInputDialog(null,"Introduce el lado del cuadrado",0)));
                cuadrado.calcularArea();
                break;

            case 2:
                Circulo circulo= new Circulo(Double.parseDouble(JOptionPane.showInputDialog(null,"Introduce el radio del circulo",0)));
                circulo.calcularArea();
                break;

            default:
                JOptionPane.showMessageDialog(null, "Ninguna figura seleccionada", "ERROR", JOptionPane.WARNING_MESSAGE);
                break;


        }

    }
}

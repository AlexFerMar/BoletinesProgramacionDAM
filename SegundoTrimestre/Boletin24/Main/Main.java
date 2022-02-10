package com.company;

import aplicacion.Aplicacion;
import aplicacion.ArrayNullExeption;
import aplicacion.Funciones;

public class Main {

    public static void main(String[] args) {
        String[] opciones = {"Agregar Libro", "Ver Stock", "Comprar Libro", "Buscar Libro", "Salir"};

        Aplicacion follasNovas = new Aplicacion();

        int seleccion = 0;
        do {

            seleccion = Funciones.simpleSelector("Escoje una opcion", "Follas Novas", opciones);

            switch (seleccion) {

                case 0 -> {
                    follasNovas.agregar();
                }

                case 1 -> {
                    try {
                        follasNovas.enseñarStock();
                    } catch (ArrayNullExeption e) {
                        Funciones.showMessage(e.getErrorMesage());
                    }
                }


                case 2 -> {
                    try {
                        follasNovas.comprarProducto();
                    } catch (ArrayNullExeption e) {
                        Funciones.showMessage(e.getErrorMesage());
                    }
                }

                case 3 -> {
                    try {
                        follasNovas.buscarCodigo();
                    } catch (ArrayNullExeption e) {
                        Funciones.showMessage(e.getErrorMesage());
                    }
                }

                default -> {
                    seleccion = -1;
                }
            }


        } while (seleccion != -1);


    }
}

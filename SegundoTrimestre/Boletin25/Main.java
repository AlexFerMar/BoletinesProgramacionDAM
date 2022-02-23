package com.company;

public class Main {

    public static void main(String[] args) {

        String[] opciones={"Añadir","Consultar","Visualizar","Borrar","Modificar","Salir"};

        Libreria follasNovas=new Libreria();

        do{
            follasNovas.readFileArray("Almacen.txt");

            switch (Funciones.simpleSelector("Escoje una opcion","Libreria",opciones)){

                case 0->{

                    follasNovas.añadirLibro();

                    follasNovas.fileWrite("Almacen.txt");

                }

                case 1->{

                    follasNovas.buscarTitulo(Funciones.askString("Introduce el titulo del libro"));

                }

                case 2->{

                    follasNovas.enseñarInventario();

                }

                case 3->{

                    follasNovas.limpiezaInventario();

                    follasNovas.fileWrite("Almacen.txt");

                }

                case 4->{

                    follasNovas.cambiaPrecio(Funciones.askString("Introduce el titulo del libro"));

                    follasNovas.fileWrite("Almacen.txt");

                }

                default->{
                    System.exit(0);
                }
            }
        }while(true);







    }
}

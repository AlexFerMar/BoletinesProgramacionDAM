package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Libreria {

    private ArrayList<Libro> almacenLibros;


    public void añadirLibro() {

        String titulo = Funciones.askString("Introduce el titulo del libro");

        boolean control = true;

        for (int i = 0; i < almacenLibros.size(); i++) {

            if (titulo.equals(almacenLibros.get(i).getTitulo())) {

                almacenLibros.get(i).setUnidades(almacenLibros.get(i).getUnidades() + Funciones.askInt("El producto de titulo \"" + titulo + "\" ya existe en la lista.Introduce la cantidad de stock a añadir."));

                Funciones.showMessage("Aumentado stock de producto");

                control = false;

                break;
            }

        }

        if (control) {
            almacenLibros.add(new Libro(titulo,
                    Funciones.askString("Introduce el nombre del autor"),
                    Funciones.askFloat("Introduce el precio del libro"),
                    Funciones.askInt("Introducel el stock inicial del libro")));


            Funciones.showMessage("Libro añadido con exito.");
        }
    }

    public void fileWrite(String fileName) {

        FileWriter fich = null;

        try {
            fich = new FileWriter(fileName);

            for (Libro x : almacenLibros) {

                fich.write(x + "\n");

            }

        } catch (IOException ex) {

            System.out.println("Error Escritura:" + ex.getMessage());

        } finally {
            try {
                fich.close();
            } catch (IOException ex) {

                System.out.println("Error Escritura:" + ex.getMessage());

            }
        }
    }

    public void readFileArray(String fileName) {

        Scanner sc = null;

        ArrayList<Libro> lista = new ArrayList<>();

        try {

            sc = new Scanner(new File(fileName));

            while (sc.hasNextLine()) {

                String[] liTexto = sc.nextLine().split("-");

                lista.add(new Libro(liTexto[0],
                        liTexto[1],
                        Float.parseFloat(liTexto[2]),
                        Integer.parseInt(liTexto[3])));
            }

        } catch (FileNotFoundException ex) {

            System.out.println("Error:" + ex.getMessage());

        } finally {
            sc.close();
        }
        almacenLibros = new ArrayList<>(lista);
    }

    public void buscarTitulo(String titulo) {

        if (almacenLibros.isEmpty()) Funciones.showMessage("El inventario esta vacio");

        else {

            boolean control=true;

            for (int i = 0; i < almacenLibros.size(); i++) {

                if (titulo.equals(almacenLibros.get(i).getTitulo())) {

                    Funciones.showMessage("\nLa ficha del producto es:" +
                            "\n -->Titulo:" + almacenLibros.get(i).getTitulo() +
                            "\n -->Autor:" + almacenLibros.get(i).getAutor() +
                            "\n -->Precio:" + Funciones.floatFormat(almacenLibros.get(i).getPrecio(), 2) + "€" +
                            "\n -->Stock:" + almacenLibros.get(i).getUnidades() +
                            "");

                    control=false;
                }


            }
            if (control) Funciones.showMessage("El producto buscado no figura en la lista");
        }
    }

    public void enseñarInventario() {

        if (almacenLibros.isEmpty()) Funciones.showMessage("El inventario esta vacio");

        String message = "<------------------------->";
        for (int i = 0; i < almacenLibros.size(); i++) {

            message += "\nLa ficha del producto es:" +
                    "\n -->Titulo:" + almacenLibros.get(i).getTitulo() +
                    "\n -->Autor:" + almacenLibros.get(i).getAutor() +
                    "\n -->Precio:" + Funciones.floatFormat(almacenLibros.get(i).getPrecio(), 2) + "€" +
                    "\n -->Stock:" + almacenLibros.get(i).getUnidades() +
                    "\n<------------------------->";

        }
        Funciones.showMessage(message);
    }

    public void limpiezaInventario() {

        if (almacenLibros.isEmpty()) Funciones.showMessage("El inventario esta vacio");

        int x = 0;

        for (int i = almacenLibros.size() - 1; i >= 0; i--) {

            if (almacenLibros.get(i).getUnidades() == 0) {
                almacenLibros.remove(i);
                x++;
            }

        }

        Funciones.showMessage("Limpieza terminada, se han eliminado " + x + " elementos");
    }

    public void cambiaPrecio(String titulo) {

        if (almacenLibros.isEmpty()) Funciones.showMessage("El inventario esta vacio");

        for (int i = 0; i < almacenLibros.size(); i++) {

            if (titulo.equals(almacenLibros.get(i).getTitulo())) {

                almacenLibros.get(i).setPrecio(Funciones.askFloat("Introduce el nuevo precio del libro"));
                break;
            } else Funciones.showMessage("El producto buscado no figura en la lista");

        }

    }


}

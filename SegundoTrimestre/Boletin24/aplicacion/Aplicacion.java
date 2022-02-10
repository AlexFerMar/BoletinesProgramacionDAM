package aplicacion;

import com.company.Libro;

import java.util.ArrayList;

public class Aplicacion {

    //añadir libros

    private ArrayList<Libro> inventarioLibreria = new ArrayList<Libro>();


    public void agregar() {

        String codigo = Funciones.askString("Introduce el ISBN del libro");

        boolean control = true;

        for (int i = 0; i < inventarioLibreria.size(); i++) {

            if (codigo.equals(inventarioLibreria.get(i).getIsbm())) {

                inventarioLibreria.get(i).setUnidades(inventarioLibreria.get(i).getUnidades() + Funciones.askInt("El producto de codigo \"" + codigo + "\" ya existe en la lista.Introduce la cantidad de stock a añadir."));

                Funciones.showMessage("Aumentado stock de producto");

                control = false;

                break;
            }

        }

        if (control) {
            inventarioLibreria.add(new Libro(Funciones.askString("Introduce el titulo del libro"),
                    Funciones.askString("Introduce el nombre del autor"), codigo,
                    Funciones.askFloat("Introduce el precio del libro"),
                    Funciones.askInt("Introducel el stock inicial del libro")));


            Funciones.showMessage("Libro añadido con exito.");
        }
    }


    //vender libros
    //dar de baja libros con 0 unidades


    public void comprarProducto() throws ArrayNullExeption {

        if (inventarioLibreria.isEmpty()) {
            throw new ArrayNullExeption();
        }
        String codigo = Funciones.askString("Introduce el ISBN del libro");

        int cantidad = Funciones.askInt("Introduce las unidades que desea del producto");
        for (int i = 0; i < inventarioLibreria.size(); i++) {

            if (codigo.equals(inventarioLibreria.get(i).getIsbm())) {

                if (inventarioLibreria.get(i).getUnidades() - cantidad < 0) {

                    Funciones.showMessage("No quedan tantas unidades del producto. Solo quedan: " + inventarioLibreria.get(i).getUnidades());

                } else {
                    inventarioLibreria.get(i).setUnidades(inventarioLibreria.get(i).getUnidades() - cantidad);

                    Funciones.showMessage("La compra ha sido realizada con exito");


                    if (inventarioLibreria.get(i).getUnidades() == 0) {

                        Funciones.showMessage("Se ha eliminado el producto \"" + inventarioLibreria.get(i).getTitulo() + "\" por falta de stock.");
                        inventarioLibreria.remove(i);


                    }

                }

                break;

            }

        }

    }


    //mostrar lista de libros, ordenados por su titulo

    public void enseñarStock() throws ArrayNullExeption {

        if (inventarioLibreria.isEmpty()) {
            throw new ArrayNullExeption();
        }

        String productos = "<------------------------->";

        for (int i = 0; i < inventarioLibreria.size(); i++) {


            productos += "\nLa ficha del producto es:" +
                    "\n -->ISBM:" + inventarioLibreria.get(i).getIsbm() +
                    "\n -->Titulo:" + inventarioLibreria.get(i).getTitulo() +
                    "\n -->Autor:" + inventarioLibreria.get(i).getAutor() +
                    "\n -->Precio:" + Funciones.floatFormat(inventarioLibreria.get(i).getPrecio(), 2) + "€" +
                    "\n -->Stock:" + inventarioLibreria.get(i).getUnidades() +
                    "\n<------------------------->";

        }

        Funciones.showMessage(productos);
    }


    //Buscar un libro determinado

    public void buscarCodigo()throws ArrayNullExeption {

        if (inventarioLibreria.isEmpty()) {
            throw new ArrayNullExeption();
        }

        String codigo=Funciones.askString("Introduce el ISBN del libro");

        for (int i = 0; i < inventarioLibreria.size(); i++) {

            if (codigo.equals(inventarioLibreria.get(i).getIsbm())) {

                Funciones.showMessage("\nLa ficha del producto es:" +
                        "\n -->ISBM:" + inventarioLibreria.get(i).getIsbm() +
                        "\n -->Titulo:" + inventarioLibreria.get(i).getTitulo() +
                        "\n -->Autor:" + inventarioLibreria.get(i).getAutor() +
                        "\n -->Precio:" + Funciones.floatFormat(inventarioLibreria.get(i).getPrecio(), 2) + "€" +
                        "\n -->Stock:" + inventarioLibreria.get(i).getUnidades() +
                        "");
                break;
            } else Funciones.showMessage("El producto buscado no figura en la lista");

        }

    }


}


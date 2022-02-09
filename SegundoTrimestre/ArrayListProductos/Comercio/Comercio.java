package Comercio;

import Almacen.Almacen;

import java.util.ArrayList;

public class Comercio {

    //Implementa a clase comercio que conteña os metos agreagar, amosar, eliminar, comprar, buscar por codigo, cantidade de productos

    private ArrayList<Producto> inventarioComercio = new ArrayList<Producto>();

    private String[] productoTipo = {"Alimentacion", "Electronica", "Ropa", "Libros", "Papeleria"};

    public void agregar() {

        int codigo=Funciones.askInt("Introduce el codigo del producto");

        boolean control = true;

        for (int i = 0; i < inventarioComercio.size(); i++) {

            if (inventarioComercio.get(i).getCodigo() == codigo) {

                inventarioComercio.get(i).setStock(inventarioComercio.get(i).getStock() + Funciones.askInt("El producto de codigo \""+ codigo +"\" ya existe en la lista.Introduce la cantidad de stock a añadir."));

                Funciones.showMessage("Aumentado stock de producto");

                control = false;

                break;
            }

        }

        if (control) {
            inventarioComercio.add(new Producto(codigo,Funciones.askString("Introduce el nombre del producto"),
                    productoTipo[Funciones.simpleSelector("Introduce el tipo de producto", "Corte Frances", productoTipo)],
                    Funciones.askFloat("Introduce el precio del producto"),
                    Funciones.askInt("Introducel el stock inicial de producto")));


            Funciones.showMessage("Producto añadido con exito.");
        }
    }


    public void enseñarStock() {

        String productos="<------------------------->";

        for (int i = 0; i < inventarioComercio.size(); i++) {


            productos+="\nLa ficha del producto es:" +
                    "\n -->Codigo:" + inventarioComercio.get(i).getCodigo() +
                    "\n -->Nombre:" + inventarioComercio.get(i).getNome() +
                    "\n -->Tipo:" + inventarioComercio.get(i).getTipo() +
                    "\n -->Precio:" + Funciones.floatFormat(inventarioComercio.get(i).getPrecio(), 2) + "€" +
                    "\n -->Stock:" + inventarioComercio.get(i).getStock()+
                    "\n<------------------------->";


        }

        Funciones.showMessage(productos);
    }


    public void eliminarProducto(int codigo) {

        for (int i = 0; i < inventarioComercio.size(); i++) {

            if (inventarioComercio.get(i).getCodigo() == codigo) {

                inventarioComercio.remove(i);

                Funciones.showMessage("Se ha eliminado el producto seleccionado.");

            }

        }

    }

    public void comprarProducto(int codigo, int cantidad) {

        for (int i = 0; i < inventarioComercio.size(); i++) {

            if (inventarioComercio.get(i).getCodigo() == codigo) {

                if (inventarioComercio.get(i).getStock() - cantidad < 0) {

                    Funciones.showMessage("No quedan tantas unidades del producto. Solo quedan: " + inventarioComercio.get(i).getStock());

                } else {
                    inventarioComercio.get(i).setStock(inventarioComercio.get(i).getStock() - cantidad);

                    Almacen.checkStock(inventarioComercio, i);
                }
                break;
            }


        }


    }

    public void buscarCodigo(int codigo) {

        for (int i = 0; i < inventarioComercio.size(); i++) {

            if (inventarioComercio.get(i).getCodigo() == codigo) {

                Funciones.showMessage("La ficha del producto es:" +
                        "\n -->Codigo:" + inventarioComercio.get(i).getCodigo() +
                        "\n -->Nombre:" + inventarioComercio.get(i).getNome() +
                        "\n -->Tipo:" + inventarioComercio.get(i).getTipo() +
                        "\n -->Precio:" + Funciones.floatFormat(inventarioComercio.get(i).getPrecio(), 2) + "€" +
                        "\n -->Stock:" + inventarioComercio.get(i).getStock() +
                        "");
                break;
            } else Funciones.showMessage("El producto buscado no figura en la lista");

        }

    }

    public void rebaja() {


        float[] descuentoNum = {0.1f, 0.2f, 0.3f, 0.4f, 0.5f};
        String[] descuentoTxt = {"10%", "20%", "30%", "40%", "50%"};

        String categoria = productoTipo[Funciones.simpleSelector("Escoje la categoria", "Descuento", productoTipo)];

        boolean control=true;


        for (int i = 0; i < inventarioComercio.size(); i++) {

            if (categoria.equals(inventarioComercio.get(i).getTipo())) {

                inventarioComercio.get(i).setPrecio(inventarioComercio.get(i).getPrecio() *
                        (1 - (descuentoNum[Funciones.simpleSelector("Escoje el porcentaje de descuento", "Descuento", descuentoTxt)])));

                control=false;
            }

        }
        if(control) Funciones.showMessage("No existe ningun producto de la categoria \"" + categoria + "\" en el almacen");
    }


}

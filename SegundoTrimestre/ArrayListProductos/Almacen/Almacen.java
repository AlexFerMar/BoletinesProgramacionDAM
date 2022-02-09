package Almacen;

import Comercio.Funciones;
import Comercio.Producto;

import java.util.ArrayList;

public class Almacen {

    public static ArrayList<Producto> checkStock(ArrayList<Producto> productos,int indice){

        if (productos.get(indice).getStock()==0) {

            Funciones.showMessage("Se ha eliminado el producto \""+productos.get(indice).getNome()+"\" por falta de stock." );
            productos.remove(indice);

        }

        return productos;

    }



}

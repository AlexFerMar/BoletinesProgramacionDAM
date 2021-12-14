package com.company;

import javax.swing.*;

public class ClasificadorProductos {

    public static void classifyProductos(Producto producto){
        if (producto.getVentas()<=100) JOptionPane.showMessageDialog(null,producto.getNombre() + "es un producto con consumo bajo");
        else if (producto.getVentas()<=500) JOptionPane.showMessageDialog(null,producto.getNombre() + "es un producto con consumo medio");
        else if (producto.getVentas()<=1000) JOptionPane.showMessageDialog(null,producto.getNombre() + "es un producto con consumo alto ");
        else  JOptionPane.showMessageDialog(null,producto.getNombre() + "es un producto de primera necesidad");
    }

}

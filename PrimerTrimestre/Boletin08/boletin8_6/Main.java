package com.company;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        Producto producto = new Producto(JOptionPane.showInputDialog("Escribe el nombre del producto:"), Double.parseDouble(JOptionPane.showInputDialog("Escribe el numero de ventas del producto:")));
        ClasificadorProductos.classifyProductos(producto);
    }
}

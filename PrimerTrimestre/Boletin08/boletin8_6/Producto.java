package com.company;

public class Producto {

    private String nombre;
    private double ventas;

    public Producto(String nombre, double ventas) {
        this.nombre = nombre;
        this.ventas = ventas;
    }

    //region Getters y Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setVentas(double ventas) {
        this.ventas = ventas;
    }
    public String getNombre() {
        return nombre;
    }

    public double getVentas() {
        return ventas;
    }
    //endregion


}

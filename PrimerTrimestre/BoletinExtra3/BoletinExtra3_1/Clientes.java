package com.DAM1;

import javax.swing.*;

public class Clientes {

    private String nombre;
    private int edad;
    private double precioCuota;
    private final double DESCUENTO40 = 0.40, DESCUENTO25 = 0.25, DESCUENTO45 = 0.45, CUOTA = 800;

    public Clientes() {
    }

    //region Getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getPrecioCuota() {
        return precioCuota;
    }

    public void setPrecioCuota(double precioCuota) {
        this.precioCuota = precioCuota;
    }
    //endregion

    public void registerCliente() {
        nombre = JOptionPane.showInputDialog("Introduzca su nombre");
        edad = Integer.parseInt(JOptionPane.showInputDialog("Introduzca su edad"));
        if (edad >= 65) precioCuota = CUOTA - CUOTA * DESCUENTO40;
        else if (edad < 21) {
            String[] siNo = {"Si", "No"};
            int selecion;
            selecion = JOptionPane.showOptionDialog(null, "Estan tus padres apuntados a este club?", "Pregunta abono",
                    JOptionPane.WARNING_MESSAGE, 0, null, siNo, siNo[1]);
            if (selecion == 0) precioCuota = CUOTA - CUOTA * DESCUENTO45;
            else precioCuota = CUOTA - CUOTA * DESCUENTO25;
        } else precioCuota = CUOTA;
    }


    public void showCliente() {
        JOptionPane.showMessageDialog(null, "El cliente " + nombre + ", de " + edad + " años de edad, debe pagar una cuota de " + precioCuota + "€");
    }

}

package com.company;

import javax.swing.*;

public class Triangulo {
    private double base;
    private double altura;

    public Triangulo() {
    }
    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }



    //region Getters y Setters
    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    //endregion
    public void calcularArea(){
        double area= Math.round((getAltura()*getBase()/2.0)*1000.0)/1000.0;
        JOptionPane.showMessageDialog(null,"El area del triangulo es "+area+" u²");
    }
}

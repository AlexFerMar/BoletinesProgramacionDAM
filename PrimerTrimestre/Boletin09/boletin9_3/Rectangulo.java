package com.company;

import javax.swing.*;

public class Rectangulo {

    private double base=0;
    private double altura=0;

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public Rectangulo() {

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

    public void askBase(){
        do{
            setBase(Double.parseDouble(JOptionPane.showInputDialog(null,"Introduce la base del rectangulo",0)));
        }while(base<=0);
    }
    public void askAltura(){
        do{
            setAltura(Double.parseDouble(JOptionPane.showInputDialog(null,"Introduce la altura del rectangulo",0)));
        }while(altura<=0);
    }

    public void calcularArea() {
        if (base==0||base==0 )JOptionPane.showMessageDialog(null, "Por favor, introduzca la base y la altura del rectangulo para calcular su area");
        else{
            double area = Math.round((getBase() * getAltura()) * 1000.0) / 1000.0;
            JOptionPane.showMessageDialog(null, "El area del rectangulo es " + area + " u²");
        }

    }
}

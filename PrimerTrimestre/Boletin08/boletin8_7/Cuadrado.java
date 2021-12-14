package com.company;

import javax.swing.*;

public class Cuadrado {
    private double lado;
    public Cuadrado(double lado) {
        this.lado = lado;
    }
//region Getters y Setters
    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }
//endregion

   public void calcularArea(){
       double area= Math.round((getLado()*getLado())*1000.0)/1000.0;
       JOptionPane.showMessageDialog(null,"El area del cuadrado es "+area +" u²");
   }
}

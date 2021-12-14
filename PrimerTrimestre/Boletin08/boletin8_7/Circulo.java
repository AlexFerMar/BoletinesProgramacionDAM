package com.company;

import javax.swing.*;

public class Circulo {

    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    public void calcularArea(){
        double area= Math.round((getRadio()* getRadio()*Math.PI)*1000.0)/1000.0;
        JOptionPane.showMessageDialog(null,"El area del circulo es "+area+" u²");
    }


}

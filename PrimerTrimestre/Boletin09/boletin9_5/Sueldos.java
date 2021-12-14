package com.DAM1;

import javax.swing.*;

public class Sueldos {
    private long numeroTrabajadores=0,sueldoBajo=0,sueldoMedio=0,sueldoAlto=0;

    public Sueldos() {
    }

    //region Getters y Setters
    public long getNumeroTrabajadores() {
        return numeroTrabajadores;
    }

    public void setNumeroTrabajadores(long numeroTrabajadores) {
        this.numeroTrabajadores = numeroTrabajadores;
    }

    public double getSueldoBajo() {
        return sueldoBajo;
    }

    public void setSueldoBajo(long sueldoBajo) {
        this.sueldoBajo = sueldoBajo;
    }

    public double getSueldoMedio() {
        return sueldoMedio;
    }

    public void setSueldoMedio(long sueldoMedio) {
        this.sueldoMedio = sueldoMedio;
    }

    public double getSueldoAlto() {
        return sueldoAlto;
    }

    public void setSueldoAlto(long sueldoAlto) {
        this.sueldoAlto = sueldoAlto;
    }
 //endregion

    public void askSueldo(){
        double i;
        do{
            i=Double.parseDouble(JOptionPane.showInputDialog("Introduce el sueldo de ltrabajador:",0));
            if(i<0) JOptionPane.showMessageDialog(null,"No puedes introducir sueldos negativos");

            else if(i==0) break;

            else if (i<1000){
                sueldoBajo++;
                numeroTrabajadores++;
            }

            else if(i<=1750) {
                sueldoMedio++;
                numeroTrabajadores++;
            }


            else {
                sueldoAlto++;
                numeroTrabajadores++;
            }

        } while(i!=0);
    }

    public void showSueldos(){
        JOptionPane.showMessageDialog(null,"El numero de personas en cada rango de sueldo es:\n->De 0€ a 999,99€: "+sueldoBajo+
                "\n->De 1000€ a 1750€: "+sueldoMedio+"\n->A partir de 1750€: "+sueldoAlto);
    }

    public void calculateSueldo(){
        if(numeroTrabajadores==0) numeroTrabajadores=1;

        JOptionPane.showMessageDialog(null,"El % de personas en cada rango de sueldo es:\n->De 0€ a 999,99€: "+sueldoBajo*100/numeroTrabajadores+
                "%\n->De 1000€ a 1750€: "+sueldoMedio*100/numeroTrabajadores+"%\n->A partir de 1750€: "+sueldoAlto*100/numeroTrabajadores+"%");
    }

}

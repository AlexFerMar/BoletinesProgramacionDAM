package boletin7_5;

import javax.swing.*;

public class ComparadorNumeros {
    double numero1,numero2,numero3;

    //region Constructores
    public ComparadorNumeros() {
    }

    public ComparadorNumeros(double numero1, double numero2, double numero3) {
        this.numero1 = numero1;
        this.numero2 = numero2;
        this.numero3 = numero3;
    }

    //endregion
    // region Getters Setters
    public double getNumero1() {
        return numero1;
    }

    public void setNumero1(double numero1) {
        this.numero1 = numero1;
    }

    public double getNumero2() {
        return numero2;
    }

    public void setNumero2(double numero2) {
        this.numero2 = numero2;
    }

    public double getNumero3() {
        return numero3;
    }

    public void setNumero3(double numero3) {
        this.numero3 = numero3;
    }
    //endregion

    public void campareNumerosCondicional(){
        if (numero1==numero2||numero1==numero3||numero3==numero2) JOptionPane.showMessageDialog(null, "Ninguno de los numero puede ser igual a otro");
        else {
            double max = numero1;
            double min = numero1;
            if (numero2 > max) max = numero2;
            if (numero3 > max) max = numero3;
            if (numero2 < min) min = numero2;
            if (numero3 < min) min = numero3;
            double mid=numero1+numero2+numero3-min-max;
            JOptionPane.showMessageDialog(null, max+">"+mid+">"+min);
        }

    }
    public void compareNumeros(){
        if (numero1==numero2||numero1==numero3||numero3==numero2) JOptionPane.showMessageDialog(null, "Ninguno de los numero puede ser igual a otro");
        else {
            double max = Math.max(numero1, Math.max(numero2, numero3));
            double min = Math.min(numero1, Math.min(numero2, numero3));
            double mid = numero1 + numero2 + numero3 - max - min;
            JOptionPane.showMessageDialog(null, max+">"+mid+">"+min);
        }
    }


}

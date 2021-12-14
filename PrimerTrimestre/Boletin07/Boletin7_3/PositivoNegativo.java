/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin7_3;

import javax.swing.JOptionPane;

/**
 * @author dam1
 */
public class PositivoNegativo {
    private double numero;

    public double getNumero() {

        return numero;
    }

    public void setNumero(double pNumero) {

        numero = pNumero;
    }

    public void comparar(double numero) {
        if (numero == 0) JOptionPane.showMessageDialog(null, "0");
        else if (numero > 0) JOptionPane.showMessageDialog(null, "+");
        else JOptionPane.showMessageDialog(null, "-");

    }


}

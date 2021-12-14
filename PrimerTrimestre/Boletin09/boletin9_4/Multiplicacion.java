package com.company;

import javax.swing.*;

public class Multiplicacion {
    public static void multiplyNumero() {
        double numero;
        do {
            numero = Double.parseDouble(JOptionPane.showInputDialog(null, "Introduce el numero a multiplicar:", 0));
            if (numero == 0) break;
            else {
                JOptionPane.showMessageDialog(null, "La tabla de multiplicar del " + numero + ":\n->0*" + numero + "=0\n->1*" + numero + "=" + numero * 1 + "\n->2*" + numero + "=" +
                        numero * 2 + "\n->3*" + numero + "=" + numero * 3 + "\n->4*" + numero + "=" + numero * 4 + "\n->5*" + numero + "=" + numero * 5 + "\n->6*" + numero + "=" + numero * 6 + "\n->7*" +
                        numero + "=" + numero * 7 + "\n->8*" + numero + "=" + numero * 8 + "\n->9*" + numero + "=" + numero * 9 + "\n->10*" + numero + "=" + numero * 10);

            }
        } while (numero != 0);
    }

}

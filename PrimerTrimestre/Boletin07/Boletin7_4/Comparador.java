package boletin7_4;

import javax.swing.*;

public class Comparador {
    public static void comparePeso(Persona persona1, Persona persona2) {
        if (persona1.getPeso() > persona2.getPeso()) {
            Double diferenciaPeso = persona1.getPeso() - persona2.getPeso();
            JOptionPane.showMessageDialog(null, persona1.getNombre() + " pesa mas que " + persona2.getNombre() + " y la diferencia de peso es de " + diferenciaPeso + "" + "Kg");
        } else if (persona2.getPeso() == persona1.getPeso())
            JOptionPane.showMessageDialog(null, persona1.getNombre() + " pesa lo mismo que " + persona2.getNombre());

        else {
            Double diferenciaPeso = persona2.getPeso() - persona1.getPeso();
            JOptionPane.showMessageDialog(null, persona2.getNombre() + " pesa mas que " + persona1.getNombre() + " y la diferencia de peso es de " + diferenciaPeso + "" + "Kg");
        }
    }
}

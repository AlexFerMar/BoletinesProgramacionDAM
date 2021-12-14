package com.DAM;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        do {
            Nota.calculateNotas(Float.parseFloat(JOptionPane.showInputDialog("Introduce la nota del primer parcial:")),
                    Float.parseFloat(JOptionPane.showInputDialog("Introduce la nota del segundo parcial:")),
                    Float.parseFloat(JOptionPane.showInputDialog("Introduce la nota del examen practico:")),
                    Integer.parseInt(JOptionPane.showInputDialog("Introduce la cantidad de boletines entregados:")),
                    Integer.parseInt(JOptionPane.showInputDialog("Introduce la cantidad de boletines totales:"))
                    );
        }while(JOptionPane.showConfirmDialog(null,"Deseas calcular otra nota?","",JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION);




    }
}

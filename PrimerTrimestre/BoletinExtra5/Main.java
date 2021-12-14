package com.DAM;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        Categoria[] categorias=Categoria.values();
        Postgrado[] postgrado =Postgrado.values();
        do {

            Empleado empleado = new Empleado(JOptionPane.showInputDialog("Introduce el codigo a asignar al empleado"),
                    JOptionPane.showInputDialog("Introduce el nombre a asignar al empleado"),
                    categorias[JOptionPane.showOptionDialog(null, "Introduce la categoria del empleado", "Categoria", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, categorias, categorias[0])],
                    postgrado[JOptionPane.showOptionDialog(null, "Introduce los estudios de postgrado del empleado", "Estudios Postgrado", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, postgrado, postgrado[0])],
                    Integer.parseInt(JOptionPane.showInputDialog("Introduce la antiguedad del empleado en la Universidad")),
                    Integer.parseInt(JOptionPane.showInputDialog("Introduce la cantidad de horas que ha impartido clase el profesor este mes")));
            empleado.calculateAntiguedad();
            empleado.calculateEstudios();
            empleado.calculateBruto();
            empleado.calculateNeto();
            JOptionPane.showMessageDialog(null, empleado);
        } while (JOptionPane.showConfirmDialog(null, "Deseas calcular otro sueldo?", "", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION);
    }
}

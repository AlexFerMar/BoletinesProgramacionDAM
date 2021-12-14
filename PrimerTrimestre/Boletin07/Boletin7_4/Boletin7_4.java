/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin7_4;

import javax.swing.*;

/**
 * @author dam1
 */
public class Boletin7_4 {

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {
        Persona persona1 = new Persona(JOptionPane.showInputDialog("Escribe el nombre de la persona:"), Double.parseDouble(JOptionPane.showInputDialog("Escribe el peso de la persona:")));
        Persona persona2 = new Persona(JOptionPane.showInputDialog("Escribe el nombre de la persona:"), Double.parseDouble(JOptionPane.showInputDialog("Escribe el peso de la persona:")));
        Comparador.comparePeso(persona1, persona2);


    }

}

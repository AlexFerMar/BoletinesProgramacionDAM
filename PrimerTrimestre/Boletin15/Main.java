package com.DAM;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        Película pelicula=new Película(JOptionPane.showInputDialog("Introduce el titulo"),
                JOptionPane.showInputDialog("Introduce el autor"),JOptionPane.showInputDialog("Introduce el formato"),
                Integer.parseInt(JOptionPane.showInputDialog("Introduce la duracion (en minutos)")),JOptionPane.showInputDialog("Introduce el actor pricipal"),
                JOptionPane.showInputDialog("Introduce la actriz pricipal"));

        Disco disco= new Disco(JOptionPane.showInputDialog("Introduce el titulo"),
                JOptionPane.showInputDialog("Introduce el autor"),JOptionPane.showInputDialog("Introduce el formato"),
                Integer.parseInt(JOptionPane.showInputDialog("Introduce la duracion")),JOptionPane.showInputDialog("Introduce el genero musical"));

        JOptionPane.showMessageDialog(null,pelicula+"\n"+disco);
    }
}

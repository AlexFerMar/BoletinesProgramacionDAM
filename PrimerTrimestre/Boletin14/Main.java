package com.DAM1;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        Libro libro=new Libro(JOptionPane.showInputDialog("Introduce el codigo"),JOptionPane.showInputDialog("Introduce el titulo"),Integer.parseInt(JOptionPane.showInputDialog("Introduce el año de publicacion")));
        Revista revista= new Revista(JOptionPane.showInputDialog("Introduce el codigo"),JOptionPane.showInputDialog("Introduce el titulo"),Integer.parseInt(JOptionPane.showInputDialog("Introduce el año de publicacion")),Integer.parseInt(JOptionPane.showInputDialog("Introduce numero de revista")));


        if(JOptionPane.showConfirmDialog(null,"Esta el libro prestado?","",JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION)
            libro.setPrestado(true);

        JOptionPane.showMessageDialog(null,libro+"\n"+revista);
    }
}

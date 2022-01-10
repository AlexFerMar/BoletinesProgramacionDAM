package com.company;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        try{

            ConversorTemperaturas.centigradosAFharenheit(Float.parseFloat(JOptionPane.showInputDialog("Introduce la temperatura en ºC")));
            ConversorTemperaturas.centígradosAReamur(Float.parseFloat(JOptionPane.showInputDialog("Introduce la temperatura en ºC")));

        }catch (TemperaturaErradaExcepcion ex){

            JOptionPane.showMessageDialog(null,ex.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);

        }

    }
}

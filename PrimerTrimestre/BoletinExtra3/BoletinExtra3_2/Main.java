package com.DAM1;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        int dia,mes,anho;
        dia=Integer.parseInt(JOptionPane.showInputDialog("Introduce el dia"));
        mes=Integer.parseInt(JOptionPane.showInputDialog("Introduce el mes"));
        anho=Integer.parseInt(JOptionPane.showInputDialog("Introduce el año"));
       boolean fechaValida=Fecha.isFechaValida(dia,mes,anho);
       JOptionPane.showMessageDialog(null,"La fecha " +dia+"/"+mes+"/"+anho+(fechaValida?"":" no")+" es valida");
    }
}

package com.company;

import javax.swing.*;

public class Gato extends Mamifero implements  IPodeNadar{

    @Override
    public void camiñar() {
        super.camiñar();
    }

    @Override
    public void nadar() {
            JOptionPane.showMessageDialog(null,"El gato nada");
        }

}

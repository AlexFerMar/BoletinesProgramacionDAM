package com.company;

import javax.swing.*;

public class Felino extends Mamifero implements IPodeNadar {

    @Override
    public void camiñar() {
        super.camiñar();
    }

    @Override
    public void nadar() {
        JOptionPane.showMessageDialog(null,"El Felino nada");
    }
}

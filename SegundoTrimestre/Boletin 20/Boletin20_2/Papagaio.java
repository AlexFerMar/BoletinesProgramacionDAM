package com.company;

import javax.swing.*;

public class Papagaio extends Aves implements IPodeVoar{

    @Override
    public void camiñar() {
        super.camiñar();
    }

    @Override
    public void vuela() {

            JOptionPane.showMessageDialog(null,"El papagaio vuela");
    }
}

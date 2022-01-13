package com.company;

import javax.swing.*;

public class Morcego extends Mamifero implements IPodeVoar{

    @Override
    public void camiñar() {
        super.camiñar();
    }

    @Override
    public void vuela() {

            JOptionPane.showMessageDialog(null,"El murcielago vuela");
        }

}

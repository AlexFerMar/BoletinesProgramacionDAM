package com.company;

import javax.swing.*;

public class Numeros10al90 {
    public static void numeros10al90(){
        double i=10,sum=0,pro = 1;
        while (i<91){
            sum+=i;
            pro=pro*i;
            i++;
        }
        JOptionPane.showMessageDialog(null, "La suma de los numeros del 10 al 90 es igual a: "+sum+"\nEl producto de los numeros del 10 al 90 es igual a: "+pro);

    }
}

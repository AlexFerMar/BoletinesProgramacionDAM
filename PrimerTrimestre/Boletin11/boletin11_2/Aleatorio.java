package com.DAM;

import javax.swing.*;
import java.util.Random;

public class Aleatorio {

    public static void generateRandom(int intentos){
        Random rand = new Random();
        //Esto genera un numero aleatorio entre 1 y 50
        int n = rand.nextInt(50);
        n += 1;
        int numero=0, i;
        for(intentos=intentos;intentos!=0;intentos--){
            numero=Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero del 1 al 50, te quedan "+intentos+" intentos"));
            if (numero==n){
                JOptionPane.showMessageDialog(null," Has acertado, el numero correcto es el "+n);
                break;
            }
            else if(Math.abs(numero-n)<=5) JOptionPane.showMessageDialog(null," El numero esta muy cerca ");
            else if(Math.abs(numero-n)<10) JOptionPane.showMessageDialog(null," El numero esta cerca ");
            else if(Math.abs(numero-n)<=20) JOptionPane.showMessageDialog(null," El numero esta lejos");
            else JOptionPane.showMessageDialog(null," El numero esta muy lejos ");
        }
        if(numero!=n) JOptionPane.showMessageDialog(null," Has perdido, el numero correcto era el "+n);
    }
}

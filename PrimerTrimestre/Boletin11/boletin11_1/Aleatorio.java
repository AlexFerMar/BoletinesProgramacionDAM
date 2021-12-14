package com.DAM;

import javax.swing.*;
import java.util.Random;

public class Aleatorio {

    public static void generateRandom(){
        int n=0,numero=0,intentos=0;

        do {
            n =Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero que debe adivinar el segundo jugador (Entre el 1 y el 50)"));
        }while(n < 1 || n > 50);

        do{
            intentos =Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero de intentos otorgados al jugador"));
        }while(intentos<1|| intentos >50);

        for(intentos=intentos;intentos!=0;intentos--){
            numero=Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero del 1 al 50, te quedan "+intentos+" intentos"));
            if (numero==n){
                JOptionPane.showMessageDialog(null," Has acertado, el numero correcto es el "+numero);
                break;
            }
        }
        if(numero!=n) JOptionPane.showMessageDialog(null," Has perdido, el numero correcto era el "+n);
    }
}

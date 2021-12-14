package com.DAM;

import javax.swing.*;
import java.text.DecimalFormat;

public class Nota {

    static final float TEORICO = 0.40f;
    static final float PRACTICO = 0.40f;


    public static int calculateBoletines(int bolHechos,int bolTotales){
        float porBoletines= (float) bolHechos/bolTotales;
        if(porBoletines>0.9) return 2;
        else if(porBoletines>=0.7) return 1;
        else return 0;
    }
    public static void calculateNotas(float nota1Parcial,float nota2Parcial,float notaPractico,int bolHechos,int bolTotales){

        if (nota1Parcial>10|| nota2Parcial>10||notaPractico>10||nota1Parcial<0|| nota2Parcial<0||notaPractico<0 && bolHechos<0||bolTotales<0) {

            JOptionPane.showMessageDialog(null,"La nota solo puede ir del 0 al 10");

            JOptionPane.showMessageDialog(null,"No puedes hacer una cantidad negativa de boletines");

        }
        else if (nota1Parcial>10|| nota2Parcial>10||notaPractico>10||nota1Parcial<0|| nota2Parcial<0||notaPractico<0 )  JOptionPane.showMessageDialog(null,"La nota solo puede ir del 0 al 10");
        else if(bolHechos<0||bolTotales<0) JOptionPane.showMessageDialog(null,"No puedes hacer una cantidad negativa de boletines");
        else {
            DecimalFormat formateador = new DecimalFormat("###.##");
            float notaTeorica = (nota1Parcial + nota2Parcial) / 2;
            float notaTotal = notaTeorica * TEORICO + notaPractico * PRACTICO + calculateBoletines(bolHechos, bolTotales);

            JOptionPane.showMessageDialog(null,
                    "PROBAS TEÓRICAS……………" + formateador.format(notaTeorica) + "\n" +
                            "  PROBAS PRÁCTICA……………" + formateador.format(notaPractico) + "\n" +
                            "  BOLETÍNS  ………………………" + bolHechos * 100 / bolTotales + "%\n" +
                            " NOTA TOTAL……………………" + formateador.format(notaTotal));
        }
    }


}

package Comercio;

import javax.swing.*;
import java.text.DecimalFormat;

public class Funciones {

    public static float askFloat(String mensaje) {

        return Float.parseFloat(JOptionPane.showInputDialog(mensaje).replace(',', '.'));
    }

    public static int askInt(String mensaje) {

        return Integer.parseInt(JOptionPane.showInputDialog(mensaje));
    }

    public static String askString(String mensaje) {

        return JOptionPane.showInputDialog(mensaje);
    }

    public static int simpleSelector(String mensaje, String titulo, String[] opciones) {

        return JOptionPane.showOptionDialog(null, mensaje, titulo,
                JOptionPane.YES_NO_CANCEL_OPTION, 0, null, opciones, -1);
    }

    public static void showMessage(String mensaje){

        JOptionPane.showMessageDialog(null,mensaje);

    }

    public static String floatFormat(float number,int nDecimal){

        String decimal="0.";

        for(int i=0;i<nDecimal;i++){
            decimal+=0;
        }

        DecimalFormat dc= new DecimalFormat(decimal);

        return dc.format(number);

    }


}

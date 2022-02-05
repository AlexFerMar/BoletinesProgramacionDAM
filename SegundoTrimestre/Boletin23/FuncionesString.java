package com.company;

import javax.swing.*;

public class FuncionesString {

    public static String[] opciones={"1", "2","3","4","5","6","7","8","9","10","11"};


    public static void medir(String mensaje){

        showMessage("La longitud del texto es : " + mensaje.length());
    }

    public static void despedazar(String mensaje){

        String despedazado="Las letras separadas son:";

        for (int i=0;i<mensaje.length();i++){

            despedazado+="\n-->'" +mensaje.charAt(i)+"'";

        }

        showMessage(despedazado);
    }

    public static void invertir(String mensaje){

        String inverso="\"";

        for (int i=0;i<mensaje.length();i++){

            inverso+=mensaje.charAt(mensaje.length()-i-1);

        }
        inverso+="\"";

        showMessage(inverso);
    }

    public static void eliminaEspacios(String mensaje){

        showMessage(mensaje.replace(" ",""));

    }

    public static void cuentaVocales(String mensaje){

        int coVocal=0;
        int coConso=0;

        for (int i=0;i<mensaje.length();i++){

            char ch = mensaje.charAt(i);

            if(ch == 'a'|| ch == 'e'|| ch == 'i' ||ch == 'o' ||ch == 'u') coVocal ++;

            else if(ch == ' ');

            else coConso++;
        }

        showMessage("En el String \""+mensaje+"\" hay "+coVocal+ " vocales y "+coConso+" consonantes");

    }

    public static void divideStrings(String mensaje){

        showMessage(mensaje=mensaje.substring(0,9) + " "+ mensaje.substring(9));

    }

    public static void cambiaMayusculas(String mensaje){

        mensaje= mensaje.toUpperCase();
        showMessage(mensaje);

        mensaje= mensaje.toLowerCase();
        showMessage(mensaje);
    }

    public static void comparaStrings(String mensaje1, String mensaje2){

       if(mensaje1.equals(mensaje2)) showMessage("Los strings son iguales");
       else showMessage("Los strings no son iguales");
    }

    public static void cambiaLetra(String mensaje,char antiguo,char novo){

        showMessage(mensaje.replace(antiguo,novo));

    }

    public static void TransformaASCII(String mensaje){

        String valorChar="El valor ASCII de cada letra es:";

        for (int i=0;i<mensaje.length();i++){

            valorChar+="\n-->'"+mensaje.charAt(i)+"': \""+(int)mensaje.charAt(i)+"\"";
        }

        showMessage(valorChar);


    }

    public static void cuentaCaracteres(String mensaje){

        int caracteres=0;
        int digitos=0;
        int simbolos=0;

        for (Character chr:mensaje.toCharArray()){

               if( Character.isAlphabetic(chr)) caracteres++;

               else if (Character.isDigit(chr)) digitos++;

               else simbolos++;

        }

        showMessage("En este String hay: \n-->Caracteres: "+caracteres+ "\n-->Digitos: "+digitos+" \n-->Simbolos: " +simbolos );

    }

    public static void showMessage(String mensaje){

        JOptionPane.showMessageDialog(null,mensaje);

    }

    public static int simpleSelector(String mensaje, String titulo, String[] opciones) {

        return JOptionPane.showOptionDialog(null, mensaje, titulo,
                JOptionPane.YES_NO_CANCEL_OPTION, 0, null, opciones, -1);
    }



}

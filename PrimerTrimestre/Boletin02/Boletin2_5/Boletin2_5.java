
package boletin2_5;

import java.util.Scanner;//Importación de la clase Scanner desde la biblioteca Java util

/**
 *
 * @author dam1
 */
public class Boletin2_5 {

    
    public static void main(String[] args) {
      double millas; //Declaramos como double la variable millas
      final double METROS_POR_MILLA=1852; //Declaramos la constante METROS_POR_MILLA
      Scanner entradaEscaner = new Scanner (System.in); //Creación de un objeto Scanner
       
        System.out.println("Introduzca las millas nauticas que quiere convertir a metros:");//Saca por pantalla la peticion de las millas nauticas
        millas = entradaEscaner.nextDouble(); //Recoje por consola el valor de las millas nauticas
        double metros= millas*METROS_POR_MILLA;// Calcula cuantos metros hay
        System.out.println(millas+" millas nauticas equivalen a "+metros+" metros");//Saca por pantalla los metros equivalentes a las millas dadas
    }
    
}

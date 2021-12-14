package boletin2_2;

import java.util.Scanner;//Importación de la clase Scanner desde la biblioteca Java util

/**
 *
 * @author dam1
 */
public class Boletin2_2 {
    public static void main(String[] args) {
     double lado; //Declaramos la variable lado como double
     
     Scanner entradaEscaner = new Scanner (System.in); //Creación de un objeto Scanner
     
     System.out.println("Introduzca el lado del cuadrado:");//Saca por pantalla la peticion del lado del cuadrado
     lado = entradaEscaner.nextDouble(); //Recoje por consola el valor del lado del cuadrado
     
     double area=Math.pow(lado,2); // Formula de calculo del area, usamos pow(base,exponente) para elevar el lado al cuadrado
     System.out.println("A area é "+area+ " u²"); // Sacamos el resultado por pantalla
    }
    
}

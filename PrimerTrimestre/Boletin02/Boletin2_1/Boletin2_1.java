package boletin2_1;

import java.util.Scanner;//Importación de la clase Scanner desde la biblioteca Java util

/**
 *
 * @author dam1
 */
public class Boletin2_1 {

    public static void main(String[] args) {
        
        double base,altura; //Declaramos las variables base y altura como double
        Scanner entradaEscaner = new Scanner (System.in); //Creación de un objeto Scanner
       
        System.out.println("Introduzca la base del triangulo:");//Saca por pantalla la peticion de la base
        base = entradaEscaner.nextDouble(); //Recoje por consola el valor la base
        
        System.out.println("Introduzca la altura del triangulo:"); //Saca por pantalla la peticion de la altura
        altura=entradaEscaner.nextDouble();//Recoje por consola el valor de la altura
        
        double area=base*altura/2; //Esto calcula el area del triangulo
        System.out.println("A area do triangulo é "+ area+" u²"); // Esto saca por pantalla un string concatenado con el resultado
          }
    
}


package boletin2_3;

import java.util.Scanner;//Importación de la clase Scanner desde la biblioteca Java util
/**
 *
 * @author dam1
 */
public class Boletin2_3 {
    
    public static void main(String[] args) {
        
        double euros,euroADolar;// Declaramos las variables euros y euroADolar como double
       
        Scanner entradaEscaner = new Scanner (System.in); //Creación de un objeto Scanner
       
        System.out.println("Introduzca los euros a cambiar:");//Saca por pantalla la peticion de los euros
        euros = entradaEscaner.nextDouble(); //Recoje por consola el valor de los euros
        
        System.out.println("Introduzca el valor actual del dolar:"); //Saca por pantalla la peticion del valor del dolar
        euroADolar=entradaEscaner.nextDouble();//Recoje por consola el valor de la conversion
        
        double dolares=euros*euroADolar;//Ponemos el calculo de los dolares 
        
        double dolaresDecimal = Math.round(dolares*100.0)/100.0; //Esta linea redondea los dolares para que solo tenga dos decimales
        double eurosDecimal = Math.round(euros*100.0)/100.0;//Redodndea los euros para que solo tenga dos decimales
       
        System.out.println(eurosDecimal+" euros equivalen a "+dolaresDecimal+" dolares");//Sacamos resultado por pantalla
    }
    
}

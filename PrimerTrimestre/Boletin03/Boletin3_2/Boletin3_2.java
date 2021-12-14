package boletin3_2;

import java.util.Scanner;//Importación de la clase Scanner desde la biblioteca Java util

/**
 *
 * @author dam1
 */
public class Boletin3_2 {

    public static void main(String[] args) {
        
        double gradosC;
        
        Scanner entradaEscaner = new Scanner (System.in); //Creación de un objeto Scanner
       
        System.out.println("Introduzca los ºC a convertir:");//Saca por pantalla la peticion de los grados celsius
        gradosC= entradaEscaner.nextDouble();//Recoje por consola el valor de los grados celsius
        
        double gradosF=gradosC*1.8+32, gradosK=gradosC+273.15; //Declaro y asigno las variables gradosF y gradosK que representan los grados Fahrenheit y los grados kelvin respectivamente
        
        System.out.println(gradosC+"ºC equivaldrian:"+"\n"+"->"+gradosF+"ºF" +"\n"+ "->"+gradosK+"ºK");//Saca por pantalla la solucion con los grados celsius,los grados Fahrenheit y los grados kelvin
    }
    
}

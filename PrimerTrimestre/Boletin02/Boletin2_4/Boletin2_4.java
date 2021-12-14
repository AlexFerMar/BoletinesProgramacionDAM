
package boletin2_4;

import java.util.Scanner;//Importación de la clase Scanner desde la biblioteca Java util

/**
 *
 * @author dam1
 */
public class Boletin2_4 {
    
    public static void main(String[] args) {
        double numero1,numero2;
        
        Scanner entradaEscaner = new Scanner (System.in); //Creación de un objeto Scanner
       
        System.out.println("Introduzca el primer numero:");//Saca por pantalla la peticion del numero1
        numero1= entradaEscaner.nextFloat();//Recoje por consola el valor dedel numero2
        
        System.out.println("Introduzca el segundo numero:"); //Saca por pantalla la peticion del numero2
        numero2=entradaEscaner.nextFloat();//Recoje por consola el valor dedel numero2
        
        double suma= numero1 +numero2;      //Grupo de operaciones matematicas
        double resta1=numero1-numero2;      //Grupo de operaciones matematicas
        double resta2=numero2-numero1;      //Grupo de operaciones matematicas
        double producto=numero1*numero2;    //Grupo de operaciones matematicas
        double cociente1=numero1/numero2;   //Grupo de operaciones matematicas
        double cociente2=numero2/numero1;   //Grupo de operaciones matematicas
        
        System.out.println(numero1+"+"+numero2+"="+suma);       //Sacamos los resultados por pantalla
        System.out.println(numero1+"-"+numero2+"="+resta1 );    //Sacamos los resultados por pantalla
        System.out.println(numero2+"-"+numero1+"="+resta2 );    //Sacamos los resultados por pantalla
        System.out.println(numero1+"*"+numero2+"="+producto );  //Sacamos los resultados por pantalla
        System.out.println(numero1+"/"+numero2+"="+cociente1 ); //Sacamos los resultados por pantalla
        System.out.println(numero2+"/"+numero1+"="+cociente2 ); //Sacamos los resultados por pantalla
    }
        
    }
    

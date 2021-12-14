
package boletin3_4;

import java.util.Scanner;//Importación de la clase Scanner desde la biblioteca Java util
/**
 *
 * @author dam1
 */
public class Boletin3_4 {

    public static void main(String[] args) {
        int dinero;
        
        Scanner entradaEscaner = new Scanner (System.in); //Creación de un objeto Scanner
       
        System.out.println("Introduzca la cantidad de dinero que quiere retirar:");//Saca por pantalla la peticion de la cantidad de dinero
        dinero= entradaEscaner.nextInt();//Recoje por consola la cantidad de dinero
        
        int billetes100=dinero/100;//Calcula la cantidad de billetes de 100€ a retirar 
        dinero=dinero%100; //Cambia el valor de la variable dinero a la cantidad de dinero que queda despues de restar losa billetes de 100€
        
        int billetes20=dinero/20;//Calcula la cantidad de billetes de 20€ a retirar 
        dinero=dinero%20;//Cambia el valor de la variable dinero a la cantidad de dinero que queda despues de restar losa billetes de 20€
        
        int billetes5=dinero/5;//Calcula la cantidad de billetes de 5€ a retirar 
        
        int monedas1=dinero%5;//Calcula la cantidad de monedas de 1€ a retirar 
        
       System.out.println("El cajero sacara:"+"\n"+billetes100 +" billetes de 100€"+"\n"+billetes20 +" billetes de 20€"+"\n"+billetes5 +" billetes de 5€"+"\n"+monedas1 +" monedas de 1€");
       //Saca el resultado por pantalla de los billetes que devuelve el cajero 




                
    }
    
}


package boletinextra_3;

import java.util.Scanner;//Importación de la clase Scanner desde la biblioteca Java util
/**
 *
 * @author dam1
 */
public class BoletinExtra_3 {
    public static void main(String[] args) {
        final double REBAJA=0.25;//Declaro REBAJA como constante
        double precioOriginal; //Declaro precioOriginal como variable de tipo double
        
        Scanner entradaEscaner = new Scanner (System.in); //Creación de un objeto Scanner
        
        
        System.out.print("Introduzca el precio original del producto:");//Saca por pantalla la peticion del precio original del producto
        precioOriginal = entradaEscaner.nextDouble(); //Recoje por consola el valor del precio original del producto
        
        
       double precioRebaja=precioOriginal*(1-REBAJA);//Declara y calcula el precio final aplicandole el porcentaje de rebaja
        
       double precioRebajaDecimal = Math.round(precioRebaja*100.0)/100.0; //Esta linea redondea los EUROS para que solo tenga dos decimales
       
       System.out.println("El pantalon costaba originalmente "+ precioOriginal+"€ y despues de una rebaja del "+ (REBAJA*100) + "% el precio al que esta ahora es "+precioRebaja+"€");
       //Saca el resultado por pantalla
    }
    
}

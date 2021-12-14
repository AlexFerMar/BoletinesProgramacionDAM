
package boletin3_1;

import java.util.Scanner;//Importación de la clase Scanner desde la biblioteca Java util
/**
 *
 * @author dam1
 */
public class Boletin3_1 {
    
    public static void main(String[] args) {
        
        double precioInicial,precioFinal;
        
        Scanner entradaEscaner = new Scanner (System.in); //Creación de un objeto Scanner
       
        System.out.println("Introduzca el precio inicial del producto:");//Saca por pantalla la peticion del precio original del producto
        precioInicial= entradaEscaner.nextDouble();//Recoje por consola el valor del precio original del producto
        
        System.out.println("Introduzca el precio con descuento del producto:"); //Saca por pantalla la peticion del precio con descuento del producto
        precioFinal=entradaEscaner.nextDouble();//Recoje por consola el precio con descuento del producto
        
        double descuento=(1-precioFinal/precioInicial)*100;// Calcula el descuento en % del producto comprado 
        double descuentoDecimal = Math.round(descuento*10.0)/10.0;//Redodndea los euros para que solo tenga un numero decimal 
        
        System.out.println("El prdoducto costaba "+precioInicial+"€ y he pagado "+precioFinal+"€, con lo que me han aplicado un descuento del"+ descuentoDecimal+"%");//Saca por pantalla el rsultado, que incluye el precio inicial, el final y el descuento efectuado 
                
        
            
        
        
        
    }
    
}

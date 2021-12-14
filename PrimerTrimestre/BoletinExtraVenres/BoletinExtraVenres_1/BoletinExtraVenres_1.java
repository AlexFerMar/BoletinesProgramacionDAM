
package boletinextravenres_1;

import java.util.Scanner;//Importación de la clase Scanner desde la biblioteca Java util
/**
 *
 * @author dam1
 */
public class BoletinExtraVenres_1 {


    public static void main(String[] args) {
        
        final double IVA=0.21;
        String nombreProducto;
        double precioProducto;
        
        Scanner entradaEscaner = new Scanner (System.in); //Creación de un objeto Scanner
        
        System.out.print("Introduzca el nombre del producto: ");//Saca por pantalla la peticion del nombre del producto
        nombreProducto = entradaEscaner.next(); //Recoje por consola el nombre del producto
        
        System.out.print("Introduzca el valor del producto: "); //Saca por pantalla la peticion del valor del producto
        precioProducto=entradaEscaner.nextDouble();//Recoje por consola el valor del producto
        
        double precioProductoIVA= precioProducto*(1+IVA); //Calculamos el precio del producto una vez aplicado el IVA
        
        precioProductoIVA = Math.round(precioProductoIVA*100.0)/100.0; //Esta linea redondea el precio del producto (con IVA) para que solo tenga dos decimales
         
         
        System.out.println("El producto '"+nombreProducto+"' tiene un valor de " +precioProductoIVA+"€ una vez añadido el iva");//Savamos el resultado por pantalla 
    }
    
}

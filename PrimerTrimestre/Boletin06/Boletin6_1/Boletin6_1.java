
package boletin6_1;

import java.util.Scanner;//Importación de la clase Scanner desde la biblioteca Java util
/**
 *
 * @author wolke
 */

public class Boletin6_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int masVelocidad;
        int menosVelocidad;
        
        Scanner escaner= new Scanner(System.in);
        
        Coche coche= new Coche();//Creamos un nuevo objeto de la clase Coche (Instanciamos)
        
        System.out.println("La velocidad actual del coche es "+coche.getVelocidade()+"Km/h");
        
        System.out.print("Introduce la velocidad a acelerar en Km/h: ");//Saca por pantalla la peticion de la velocidad a acelerar
        masVelocidad=escaner.nextInt();//Recoge el valor de la velocidad a acelerar 
        
        coche.acelerar(masVelocidad);//Aceleramos el coche 
        
        System.out.println("La velocidad actual del coche es "+coche.getVelocidade()+"Km/h");
        
        System.out.print("Introduce la velocidad a decelerar en Km/h: ");//Saca por pantalla la peticion de la velocidad a decelerar
        menosVelocidad=escaner.nextInt();//Recoge el valor de la velocidad a decelerar
        
        coche.frenar(menosVelocidad);//Frenamos el coche
    
        System.out.println("La velocidad actual del coche es "+coche.getVelocidade()+"Km/h");
        
        
        
        
        
    }

}

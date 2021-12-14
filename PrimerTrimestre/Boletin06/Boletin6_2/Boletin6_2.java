
package boletin6_2;

import java.util.Scanner;

/**
 *
 * @author wolke
 */
public class Boletin6_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double meridiano, paralelo, distanciaTerra;
        
        //Instanciamos Satelite en el objeto 'satelite1' (Este es el constructor por defecto) 
        Satelite satelite1= new Satelite();
        
        satelite1.verPosicion();
        
        //Instanciamos Scanner en el objeto 'escaner' 
        Scanner escaner= new Scanner(System.in);
       
        //Aqui pedimos todas la variable pertinentes por pantalla
        System.out.print("Introduce el meridiano: ");
        meridiano=escaner.nextDouble();
        
        System.out.print("Introduce el paralelo: ");
        paralelo=escaner.nextDouble();
        
        System.out.print("Introduce el distanciaTerra: ");
        distanciaTerra=escaner.nextDouble();
        
        //Instanciamos Satelite en el objeto 'satelite2' 
        Satelite satelite2= new Satelite(meridiano,paralelo,distanciaTerra);
        
        satelite2.verPosicion();
        
        
        
    }
    
}

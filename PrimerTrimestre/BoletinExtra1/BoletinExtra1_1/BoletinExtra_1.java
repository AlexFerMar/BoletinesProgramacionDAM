
package boletinextra_1;

import java.util.Scanner;//Importación de la clase Scanner desde la biblioteca Java util
/**
 *
 * @author dam1
 */
public class BoletinExtra_1 {
    public static void main(String[] args) {
        String nombreCompleto,fechaNacimiento;//Declaro como string nombreCompleto y fechaNcimiento
        
        Scanner entradaEscaner = new Scanner (System.in); //Creación de un objeto Scanner
       
        System.out.print("Introduce tu nombre completo: ");//Saca por pantalla la peticion del nombre
        nombreCompleto= entradaEscaner.nextLine(); //Recoje por consola el valor del nombre
        
        System.out.print("Introduce tu fecha de nacimiento: ");//Saca por pantalla la peticion de la fecha de nacimiento 
        fechaNacimiento= entradaEscaner.nextLine(); //Recoje por consola el valor de la fecha de nacimiento
        
        System.out.println("Tu nombre es "+nombreCompleto+"\n"+"Naciste el "+fechaNacimiento);//Saco el resultado por pantalla
    }
    
}


package boletin3_3;

import java.util.Scanner;//Importación de la clase Scanner desde la biblioteca Java util
/**
 *
 * @author dam1
 */
public class Boletin3_3 {

    public static void main(String[] args) {
        // TODO code application logic here
        int billetes100,billetes20,billetes5,monedas1;
        
        Scanner entradaEscaner = new Scanner (System.in); //Creación de un objeto Scanner
       
        System.out.print("Introduzca la cantidad de billetes de 100€ a ingresar: ");//Saca por pantalla la cantidad de billetes de 100€ a ingresar
        billetes100= entradaEscaner.nextInt();//Recoje por consola la cantidad de billetes de 100€ a ingresar
        
        System.out.print("Introduzca la cantidad de billetes de 20€ a ingresar: ");//Saca por pantalla la cantidad de billetes de 20€ a ingresar
        billetes20= entradaEscaner.nextInt();//Recoje por consola la cantidad de billetes de 20€ a ingresar
        
        System.out.print("Introduzca la cantidad de billetes de 5€ a ingresar: ");//Saca por pantalla la cantidad de billetes de 5€ a ingresar
        billetes5= entradaEscaner.nextInt();//Recoje por consola la cantidad de billetes de 5€ a ingresar
        
        System.out.print("Introduzca la cantidad de monedas de 1€ a ingresar: ");//Saca por pantalla la cantidad de monedas de 1€ a ingresar
        monedas1= entradaEscaner.nextInt();//Recoje por consola la cantidad de monedas de 1€ a ingresar
        
        int dinero=billetes100*100+billetes20*20+billetes5*5+monedas1;
        
        System.out.println("Ha ingresado usted "+ dinero+"€");//Saca por pantalla la el dinero total ingresado
        
    }
    
    
}

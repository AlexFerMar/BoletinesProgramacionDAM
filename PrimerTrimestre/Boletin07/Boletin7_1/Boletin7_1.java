package boletin7_1;

import java.util.Scanner;

/**
 *
 * @author dam1
 */
public class Boletin7_1 {

    
    public static void main(String[] args) {
        
        Scanner escaner= new Scanner(System.in);
        
        Positivo pos=new Positivo();
        System.out.print("Introduce un numero: ");
        pos.checkPositivo(escaner.nextDouble());
    }
    
}

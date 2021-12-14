package boletin6_3;

import java.util.Scanner;

/**
 *
 * @author wolke
 */
public class Boletin6_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        double radio;
        
        
        //Prueba del constructor por defecto
        System.out.println("->Comprobacion de que el constructor por defecto funciona bien");
        //Instanciamos Circulo en el objeto 'circulo1' (Este es el constructor por defecto) 
        Circulo circulo1= new Circulo();
        
        circulo1.showCirculo();
        
        //Prueba del constructor con parametros
        
        System.out.println("\n->Comprobacion de que el constructor con parametros funciona bien\n");
        //Instanciamos Scanner en el objeto 'escaner' 
        Scanner escaner= new Scanner(System.in);
       
        //Aqui pedimos el radio por pantalla
        System.out.print("Introduce el radio: ");
        radio=escaner.nextDouble();
        
        //Instanciamos Circulo en el objeto 'circulo2' 
        Circulo circulo2= new Circulo(radio);
        
        circulo2.showCirculo();
        
        
        //Prueba de getter y setter 
        System.out.println("\n->Comprobacion de que setRadio() y getRadio() funcionan bien\n");
        //Aqui pedimos el radio por pantalla
        System.out.print("Introduce el radio: ");
        radio=escaner.nextDouble();
        
        Circulo circulo3= new Circulo();
        
        circulo3.setRadio(radio);
        
        System.out.println("\n El radio es: "+circulo3.getRadio()+" (Esto solo es una comprobacion del getter de radio)");//Prueba de que el getter de radio funciona 
        
        circulo3.showCirculo();
        
        
    }
    
}

package boletinextra_2;

import java.util.Scanner;//Importación de la clase Scanner desde la biblioteca Java util
/**
 *
 * @author dam1
 */
public class BoletinExtra_2 {

    public static void main(String[] args) {
        String nombreAsignatura;//Declaro como string nombreAsignatura
        double notaPrimer,notaSegundo;//Declaro las variables notaPrimer y notaSegundo como double
        
        Scanner entradaEscaner = new Scanner (System.in); //Creación de un objeto Scanner
        
        System.out.print("Introduce el nombre de la asignatura cursada: ");//Saca por pantalla la peticion del nombre de la asignatura
        nombreAsignatura= entradaEscaner.nextLine(); //Recoje por consola el valor del nombre de la asignatura
        
        System.out.print("Introduce la nota del primer parcial: ");//Saca por pantalla la peticion del primer parcial
        notaPrimer= entradaEscaner.nextDouble(); //Recoje por consola el valor del primer parcial
        
        System.out.print("Introduce la nota del segundo parcial: ");//Saca por pantalla la peticion del segundo parcial
        notaSegundo= entradaEscaner.nextDouble(); //Recoje por consola el valor del segundo parcial
        
        double notaFinal=(notaPrimer+notaSegundo)/2;//Calculo la nota final haciendo la media de los dos examnes 
        
        System.out.println("Las notas para el curso"+nombreAsignatura+ "son:"+"\n" + "Para el primer parcial la nota es: "+notaPrimer+"\n" + "Para el segundo parcial la nota es: "+notaSegundo+"\n" + "La nota final es: "+notaFinal);
        //Saca el resultado por pantalla
    }
    
}

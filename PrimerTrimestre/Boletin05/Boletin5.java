package boletin5;

import java.util.Scanner;//Importación de la clase Scanner desde la biblioteca Java util

/**
 *
 * @author dam1
 */
public class Boletin5 {

    public static void main(String[] args) {
        double km; //kilómetros percorridos polo coche
        double litros;  //Litros de combustible consumidos
        double velocidadMed;//Velocidade media
        double precioGas;  //Prezo da gasolina

        Scanner entradaEscaner = new Scanner(System.in); //Creación de un objeto Scanner

        //Objeto a
        System.out.println("Boletin 5a: Ejemplo de un objeto tipo Consumo con los parametros vacios");
        
        System.out.println("\n->Datos del viaje:");

        Consumo viajeA = new Consumo(); //Creación de un objeto Consumo sin introducir parametros

        viajeA.amosarConsumo();

        //Objeto b,c,d,e,f
        System.out.println("Boletin 5b,5c,5d,5e,5f: Introduce los datos a mano para completar el apartdado de cada boletin");

        System.out.println("\n->Datos del viaje:");

        System.out.print("Introduzca los kilometros recorridos: "); //Saca por pantalla la peticion de los kilometros recorridos
        km = entradaEscaner.nextDouble(); //Recoje por consola los kilometros recorridos

        System.out.print("Introduzca los litros de gasolina gastados: "); //Saca por pantalla la peticion de los litros de gasolina gastados
        litros = entradaEscaner.nextDouble(); //Recoje por consola los litros de gasolina gastados

        System.out.print("Introduzca la velocidad media del veiculo durante el viaje: "); //Saca por pantalla la peticion de la velocidad media del veiculo durante el viaje
        velocidadMed = entradaEscaner.nextDouble(); //Recoje por consola la velocidad media del veiculo durante el viaje

        System.out.print("Introduzca el precio de la gasolina al repostar: "); //Saca por pantalla la peticion del precio de la gasolina al repostar
        precioGas = entradaEscaner.nextDouble(); //Recoje por consola el precio de la gasolina al repostar

        Consumo viaje = new Consumo(km, litros, velocidadMed, precioGas); //Creación de un objeto Consumo

        viaje.amosarConsumo();
    }

}



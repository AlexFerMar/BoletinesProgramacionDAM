package boletin4;

import java.util.Scanner;//Importación de la clase Scanner desde la biblioteca Java util

/**
 *
 * @author dam1
 */
public class Boletin4 {

    public static void main(String[] args) {
        String titulo;
        String autor;
        int ano;
        short numPaginas;
        float valoracion;

        Scanner entradaEscaner = new Scanner(System.in); //Creación de un objeto Scanner

        //A partir de esta zona se codifica el libro 1
        System.out.println("->Libro 1:");
        
        Libro libro1 = new Libro(); //Creación de un objeto Libro

        System.out.print("Introduzca el titulo del libro: "); //Saca por pantalla la peticion del titulo del libro
        titulo = entradaEscaner.next(); //Recoje por consola el titulo del libro

        System.out.print("Introduzca el autor del libro: ");  //Saca por pantalla la peticion del autor del libro
        autor = entradaEscaner.next();  //Recoje por consola el autor del libro

        System.out.print("Introduzca el año de salida del libro: ");//Saca por pantalla la peticion del año de salida del libro
        ano = entradaEscaner.nextInt();//Recoje por consola el año de salida del libro

        System.out.print("Introduzca el número de paginas del libro: ");  //Saca por pantalla la peticion del número de paginas del libro
        numPaginas = entradaEscaner.nextShort();    //Recoje por consola el número de paginas del libro

        System.out.print("Introduzca la valoracion del libro: "); //Saca por pantalla la peticion la valoracion del libro
        valoracion = entradaEscaner.nextFloat();    //Recoje por consola la valoracion del libro

        libro1.setTitulo(titulo);
        libro1.setAutor(autor);
        libro1.setAno(ano);
        libro1.setNumPaginas(numPaginas);
        libro1.setValoracion(valoracion);

        libro1.amosarLibro();

        //A partir de esta zona se codifica el libro 2
        System.out.println("\n->Libro 2:");

        System.out.print("Introduzca el titulo del libro: "); //Saca por pantalla la peticion del titulo del libro
        titulo = entradaEscaner.next(); //Recoje por consola el titulo del libro

        System.out.print("Introduzca el autor del libro: ");  //Saca por pantalla la peticion del autor del libro
        autor = entradaEscaner.next();  //Recoje por consola el autor del libro

        System.out.print("Introduzca el año de salida del libro: ");//Saca por pantalla la peticion del año de salida del libro
        ano = entradaEscaner.nextInt();//Recoje por consola el año de salida del libro

        System.out.print("Introduzca el número de paginas del libro: ");  //Saca por pantalla la peticion del número de paginas del libro
        numPaginas = entradaEscaner.nextShort();    //Recoje por consola el número de paginas del libro

        System.out.print("Introduzca la valoracion del libro: "); //Saca por pantalla la peticion la valoracion del libro
        valoracion = entradaEscaner.nextFloat();    //Recoje por consola la valoracion del libro

        Libro libro2 = new Libro(titulo, autor, ano, numPaginas); //Creación de un objeto Libro

        libro2.setValoracion(valoracion);

        libro2.amosarLibro();

    }

}

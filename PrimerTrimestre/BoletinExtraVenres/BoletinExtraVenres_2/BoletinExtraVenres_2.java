package boletinextravenres_2;

import java.util.Scanner;//Importación de la clase Scanner desde la biblioteca Java util

/**
 *
 * @author dam1
 */
public class BoletinExtraVenres_2 {

    public static void main(String[] args) {
        double a, b, c;

        Scanner entradaEscaner = new Scanner(System.in); //Creación de un objeto Scanner

        System.out.println("Para una ecuacion de segundo grado de estructura 'aX²+bX+c' introduce:");

        System.out.print("El valor de 'a': ");//Saca por pantalla la peticion de a
        a = entradaEscaner.nextDouble(); //Recoje por consola el valor de a

        System.out.print("El valor de 'b': ");//Saca por pantalla la peticion de b
        b = entradaEscaner.nextDouble(); //Recoje por consola el valor de b

        System.out.print("El valor de 'c': ");//Saca por pantalla la peticion de c
        c = entradaEscaner.nextDouble(); //Recoje por consola el valor de c

        //Abrimos condicional para comprobar si a==0 y por lo tanto no es ecuacion de segundo grado
        if (a == 0) { //Si a==0 el progrma continuara ejecutandose por aqui

            System.out.println("La ecuacion " + b + "x+" + c + " no es una ecuacion de segundo grado.");//Sacamos uno de los resultados posibles
        } else {//Si a!=0 el progrma continuara ejecutandose por aqui

            double contenidoRaiz = Math.pow(b, 2) - 4 * a * c;//Creamos una variable con el contenido de la raiz cuadrada para tener mas limpio el codigo

            //Abrimos condicional para comprobar si contenidoRaiz==0 y si contenidoRaiz<0 
            //Si contenidoRaiz==0 entonces la ecuacion solo tendra una solucion
            //Si contenidoRaiz!=0 y contenidoRaiz<0 entonces la ecuacion no tendra ninguna solucion
            //Si contenidoRaiz!=0 y contenidoRaiz>0 entonces la ecuacion tendra dos soluciones y se resolvera con normalidad 
            if (contenidoRaiz == 0) {//Si contenidoRaiz==0 el progrma continuara ejecutandose por aqui
                
                double x = -b / (2 * a);
                System.out.println("La ecuacion " + a + "x²+" + b + "x+" + c + " tiene solo una solucion. Esta es: \n->X= " + x);//Sacamos uno de los resultados posibles
                
            } else if (contenidoRaiz < 0) {//Si contenidoRaiz!=0 y contenidoRaiz<0 el progrma continuara ejecutandose por aqui

                System.out.println("La ecuacion " + a + "x²+" + b + "x+" + c + " no tiene solucion");//Sacamos uno de los resultados posible  
                
            } else {//Si contenidoRaiz!=0 y contenidoRaiz>0 el progrma continuara ejecutandose por aqui

                double x1 = (-b + Math.sqrt(contenidoRaiz)) / (2 * a);//Calculamos el primer resultado posible de X
                double x2 = (-b - Math.sqrt(contenidoRaiz)) / (2 * a); //Calculamos el segundo resultado posible de X

                System.out.println("La ecuacion " + a + "x²+" + b + "x+" + c + " tiene dos soluciones. Estas son: \n->X1= " + x1 + "\n->X2= " + x2); //Sacamos uno de los posibles resultados
            }

        }

    }

}

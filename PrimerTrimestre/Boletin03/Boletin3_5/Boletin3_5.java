
package boletin3_5;

import java.util.Scanner;//Importación de la clase Scanner desde la biblioteca Java util
/**
 *
 * @author wolke
 */
public class Boletin3_5 {
    public static void main(String[] args) {
        final int RETENCION=36,EUROS_DIA=30,EUROS_KILOMETRO=2;//Declaramos  RETENCION,EUROD_DIA Y EUROS_KILOMETRO como constantes enteras
        final double COMISION_VENTA=0.05,IRPF=0.18;//Declaramos COMISION_VENTA Y IRPF como constante double
        double salarioFijo,importeVentas,kilometrosDesplazados;
        int diasFuera;
        
        Scanner entradaEscaner = new Scanner (System.in); //Creación de un objeto Scanner
         
        System.out.print("Introduzca el salario fijo: ");//Saca por pantalla la peticion del salario base
        salarioFijo= entradaEscaner.nextDouble(); //Recoje por consola el valor del salario base
        
        System.out.print("Introduzca el importe total de las ventas del trabajador: ");//Saca por pantalla las ventas del trabajador
        importeVentas= entradaEscaner.nextDouble(); //Recoje por consola  las ventas del trabajador
        
        System.out.print("Introduzca los kilometros totales que ha viajado el trabajador: ");//Saca por pantalla la peticion de los kilometros 
        kilometrosDesplazados= entradaEscaner.nextDouble(); //Recoje por consola los kilometros 
        
        System.out.print("Introduzca los días totales que ha estado en viaje de negocios el trabajador: ");//Saca por pantalla la peticion de los días de viaje
        diasFuera= entradaEscaner.nextInt(); //Recoje por consola los días de viaje
        
        double  salarioBruto=salarioFijo+importeVentas*COMISION_VENTA+kilometrosDesplazados*EUROS_KILOMETRO+diasFuera*EUROS_DIA;//Calcula el salario bruto del trabajador
        double  salarioLiquido=salarioBruto*(1-IRPF)-RETENCION;//Calcula el salario liquido del trabajador
        
        salarioBruto = Math.round(salarioBruto*100.0)/100.0; //Redodndea los euros para que solo tenga dos decimales
        salarioLiquido = Math.round(salarioLiquido*100.0)/100.0;//Redodndea los euros para que solo tenga dos decimales
       
        System.out.println("El salario bruto es: "+ salarioBruto+"€\n"+"El salario Liquido es: "+ salarioLiquido+"€");//Sacamos resultado por pantalla
        
        
        
        
        
    }
    
}

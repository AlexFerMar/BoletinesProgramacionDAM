package com.DAM;

import javax.swing.*;
import java.util.ArrayList;

public class Parking {
    static final double CUOTAHORAS3 = 1.5;
    static final double CUOTASHORAS = 0.20;
    static final int PLAZAS = 5;
    static ArrayList<Coche> coches = new ArrayList<Coche>(PLAZAS);


    //Esta fncion añade coches al garaje
    public static void registerCoche() {
        //Esta linea comprueba si el parking esta lleno
        if (coches.size() == 5) JOptionPane.showMessageDialog(null, "Lo sentimos, el parking esta lleno.");

        else {
            //Esta linea revisa que no haya ya un coche con la misma matricula en la matriz, si lo hay te manda introducirla otra vez
            String matricula = JOptionPane.showInputDialog("Introduce la matricula del coche");
            while (searchMatricula(matricula) != -1) {
                JOptionPane.showMessageDialog(null, "La matricula esta duplicada. Por favor, intentelo de nuevo.");
                matricula = JOptionPane.showInputDialog("Introduce la matricula del coche");
            }
            //Pide hora de entrada
            int horaEntrada = askHora();
            //Pide minuto de entrada
            int minutoEntrada = askMinuto();
            //Aparca el coche en la matriz
            coches.add(new Coche(matricula, horaEntrada, minutoEntrada));
        }

    }

    public static void payCoche() {

        String matricula = JOptionPane.showInputDialog("Introduce la matricula del coche");
        //Busca existe un coche con la matricula introducida dentro de la matriz
        int indiceMatricula=searchMatricula(matricula);
        //Si no existe el coche
        if (indiceMatricula == -1) JOptionPane.showMessageDialog(null, "No se ha encontrado ningun coche con la matricula seleccionada. Por favor, intentelo de nuevo.");
        //Si esxiste el coche
        else {
            //Pide la hora y los minutos de salida
            int horaSalida = askHora(), minutoSalida = askMinuto();
            //Recupera la hora y minutos de entrada del onjeto coche
            Coche coche= coches.get(indiceMatricula);
            int horaEntrada = coche.getHoraEntrada();
            int minutoEntrada = coche.getMinutoEntrada();

            //Calcula cuanto hay que pagar por haber aparcado el coche en la matriz

            int tiempo = (horaSalida - horaEntrada) * 60 + (minutoSalida - minutoEntrada);
            if(tiempo<0) tiempo+=24*60;

            double precio;
            if (tiempo > 180) precio = 3 * CUOTAHORAS3 + (tiempo / 60 - 3) * CUOTASHORAS;

            else precio = (tiempo / 60) * CUOTASHORAS;

            precio=Math.round(precio*100D)/100D;

            JOptionPane.showMessageDialog(null,"La cantidad a abonar es de "+ precio);
            //Pide dinero y se asegura de que sea mayor que 0
            double dinero = Double.parseDouble(JOptionPane.showInputDialog("Introduce la cantidad a abonar en €"));
            while (dinero <= 0) {
                JOptionPane.showMessageDialog(null, "Introduce una cantidad correcta de dinero");
                dinero = Double.parseDouble(JOptionPane.showInputDialog("Introduce la cantidad a abonar en €"));
            }
            //Se asegura de que metes dinero suficiente para pagar el servicio
            while (precio > dinero) {
                double resto = precio - dinero;
                double ingreso = Double.parseDouble(JOptionPane.showInputDialog("Faltan " + resto + ".Por favor introduzca el importe restante."));
                dinero += ingreso;
            }
            //Imprime factura
            JOptionPane.showMessageDialog(null, "FACTURA" +
                    "\nMATRICULA COCHE ........" + matricula +
                    "\nTEMPO ................." + tiempo/60+":"+ String.format("%02d",tiempo%60) + "h" +
                    "\nPRECIO..............." + precio + "€" +
                    "\nCARTOS RECIBIDOS..........." + Math.round(dinero*100D)/100D + "€" +
                    "\nCARTOS DEVOLTOS............" + Math.round((dinero-precio)*100D)/100D + "€" +
                    "\n\nGRACIAS POR USAR O NOSO APARCADOIRO");
            //Desaparca el coche de la matriz
            coches.remove(indiceMatricula);
        }

    }
    //Busca el coche dentro de la matriz utilizando la matricula
    public static int searchMatricula(String pMatricula){
        for (Coche coche : coches) {
            if (pMatricula.equals(coche.getMatricula())) {
                return coches.indexOf(coche);
            }
        }
        return -1;
    }
    //Se asegura de que el formato de hora es correcto
    public static int askHora(){

        int hora= Integer.parseInt(JOptionPane.showInputDialog("Introduce la hora:"));
        while (hora > 23 || hora < 0) {
            JOptionPane.showMessageDialog(null, "La hora introducida no es correcta");
            hora = Integer.parseInt(JOptionPane.showInputDialog("Introduce la hora:"));
        }
        return hora;
    }
    //Se asegura de que el formato de minuto es correcto
    public static int askMinuto(){
        int minuto= Integer.parseInt(JOptionPane.showInputDialog("Introduce el minuto de llegada"));
        while (minuto > 59 || minuto < 0) {
            JOptionPane.showMessageDialog(null, "El minuto introducido no es correcto");
            minuto = Integer.parseInt(JOptionPane.showInputDialog("Introduce el minuto de llegada"));
        }
        return minuto;
    }

}

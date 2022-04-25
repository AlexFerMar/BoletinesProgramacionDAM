import barcos.Barcos;

import javax.swing.*;
import java.util.ArrayList;

public class Methods {

    public static void calcularPrecioBarco(Barcos barco,int dias){

        barco.setPrezoArrendamento(barco.calcularPrecioEspecial()+barco.getEslora()*dias);

    }
    public static String crearRecibo(ArrayList<Barcos> listaBarcos){

        float precioTotal=0;
        String recibo="<-----Factura Barcos----->";
        for (Barcos barco:listaBarcos){

            recibo+="\n-->"+barco.getClass().getSimpleName()+":" +
                    "\n   ->Matricula:"+barco.getMatricula()+
                    "\n   ->Eslora:"+barco.getEslora()+
                    "\n   ->Precio:"+barco.getPrezoArrendamento();

            precioTotal+=barco.getPrezoArrendamento();

        }

        recibo+="\n TOTAL:............"+precioTotal;

        return recibo;
    }

    public static String askString(String mensaje) {

        return JOptionPane.showInputDialog(mensaje);
    }

    public static void showMessage(String mensaje){

        JOptionPane.showMessageDialog(null,mensaje);

    }

    public static float askFloat(String mensaje) {

        return Float.parseFloat(JOptionPane.showInputDialog(mensaje).replace(',', '.'));
    }

    public static int askInt(String mensaje) {

        return Integer.parseInt(JOptionPane.showInputDialog(mensaje));
    }

    public static int simpleSelector(String mensaje, String titulo, String[] opciones) {

        return JOptionPane.showOptionDialog(null, mensaje, titulo,
                JOptionPane.YES_NO_CANCEL_OPTION, 0, null, opciones, -1);
    }

}

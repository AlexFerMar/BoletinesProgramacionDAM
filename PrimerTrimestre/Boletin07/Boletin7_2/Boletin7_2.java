package boletin7_2;

import javax.swing.JOptionPane;

/**
 * @author dam1
 */
public class Boletin7_2 {

    public static void main(String[] args) {
        Operacion operacion = new Operacion();

        operacion.setNum1(Short.parseShort(JOptionPane.showInputDialog("Escribe el primer numero:")));//Pide el numero por interfaz, lo convierte a short y lo settea

        operacion.setNum2(Short.parseShort(JOptionPane.showInputDialog("Escribe el segundo numero:")));//Pide el numero por interfaz, lo convierte a short y lo settea

        operacion.showRespuesta();

    }
}

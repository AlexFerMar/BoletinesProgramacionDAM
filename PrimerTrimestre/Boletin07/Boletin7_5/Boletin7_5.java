
package boletin7_5;

import javax.swing.*;

/**
 *
 * @author dam1
 */
public class Boletin7_5 {


    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Introduce tres numeros DISTINTOS");
        ComparadorNumeros comparador= new ComparadorNumeros(Double.parseDouble(JOptionPane.showInputDialog(null,"Introduce el primer numero")),Double.parseDouble(JOptionPane.showInputDialog(null,"Introduce el segundo numero")),Double.parseDouble(JOptionPane.showInputDialog(null,"Introduce el tercer numero")));
        comparador.campareNumerosCondicional();
        comparador.compareNumeros();
    }

    
}

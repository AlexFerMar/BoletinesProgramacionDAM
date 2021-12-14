
package boletin7_3;

import javax.swing.JOptionPane;

/**
 *
 * @author dam1
 */
public class Boletin7_3 {

    public static void main(String[] args) {
        
        PositivoNegativo numero= new PositivoNegativo();
        numero.setNumero(Double.parseDouble(JOptionPane.showInputDialog("Escribe un numero")));
        numero.comparar(numero.getNumero());
    }
    
}

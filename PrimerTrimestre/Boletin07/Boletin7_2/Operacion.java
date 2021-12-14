
package boletin7_2;

import javax.swing.JOptionPane;

/**
 * @author dam1
 */
public class Operacion {
    private short num1, num2;

    public short getNum1() {
        return num1;
    }

    public void setNum1(short pNum1) {
        num1 = pNum1;
    }

    public short getNum2() {
        return num2;
    }

    public void setNum2(short pNum2) {
        num2 = pNum2;
    }

    public short addNumeros() {
        short sum = (short) (getNum1() + getNum2());
        return sum;
    }

    public short subNumeros() {
        short sub = (short) (getNum1() - getNum2());
        return sub;
    }

    public void showRespuesta() {
        if (getNum2() < getNum1())
            JOptionPane.showMessageDialog(null, getNum1() + "+" + getNum2() + "=" + addNumeros() + "\n" + "\n" + getNum1() + "-" + getNum2() + "=" + subNumeros());

        else JOptionPane.showMessageDialog(null, getNum1() + "+" + getNum2() + "=" + addNumeros());

    }


}

    
   
   
    


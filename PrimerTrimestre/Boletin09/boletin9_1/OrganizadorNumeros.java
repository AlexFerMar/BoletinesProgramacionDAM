package com.company;

import javax.swing.*;

public class OrganizadorNumeros {

    public static void organizeNumero(){
      double numero;
      int mayor0=0,menor0=0,igual0 = 0;
      int i;
      for(i=0;i<10;i++){
         numero=Double.parseDouble(JOptionPane.showInputDialog(null,"Introduce un numero",0));
         if(numero==0) igual0++;
         else if (numero<0) menor0++;
         else mayor0++;
      }
        JOptionPane.showMessageDialog(null,"Hay "+ igual0+" numeros iguales a 0 \nHay "+ mayor0+" numeros mayores a 0 \nHay "+menor0+" numeros menores que 0");

    }
}

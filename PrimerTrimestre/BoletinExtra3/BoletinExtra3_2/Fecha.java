package com.DAM1;

public class Fecha {

    public static boolean isFechaValida(int pDIa, int pMes, int pAnho) {
        if (pAnho < 1600 || pAnho > 3000) return false; //Validamnos el año

        if (pDIa <= 0) return false; //Nos aseguramos de que los dias no sean negativos o 0

        switch (pMes) {
            case 1, 3, 5, 7, 8, 10, 12: //Evaluamos los meses de 31 dias

                return pDIa <= 31;

            case 4, 6, 9, 11: //Evaluamos los meses de 30 dias

                return pDIa <=30;

            case 2: //Evaluamos febrero

                if (pAnho % 4 == 0 && pAnho % 100 != 0 || pAnho % 400 == 0) return pDIa <= 29; //Comprobamos si el año es bisiesto

                else return pDIa <= 28;

            default: //Colador para los meses que no esten contemplados (1 al 12)
                return false;


        }

    }


}

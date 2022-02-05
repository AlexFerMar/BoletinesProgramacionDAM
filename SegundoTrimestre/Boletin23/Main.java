package com.company;

public class Main {

    public static void main(String[] args) {


        int seleccion=0;

        do{

            seleccion=FuncionesString.simpleSelector("Escoje una oipcion","Strins",FuncionesString.opciones);

            switch (seleccion) {

                case 0 -> {

                   FuncionesString.medir("Esto é  Java!");

                }

                case 1 -> {

                  FuncionesString.despedazar("Java");

                }

                case 2 -> {

                    FuncionesString.invertir("Java desde 0");

                }

                case 3 -> {

                   FuncionesString.eliminaEspacios("James Gosling Created Xava");

                }

                case 4 -> {

                    FuncionesString.cuentaVocales("java java java");

                }

                case 5 -> {

                   FuncionesString.divideStrings("www. javadesde0. com");

                }

                case 6 -> {

                    FuncionesString.cambiaMayusculas("javeros");

                }


                case 7 -> {

                    FuncionesString.comparaStrings("Java","JavaScript");

                }

                case 8 -> {

                   FuncionesString.cambiaLetra(" Jeve jeve jeve",'e','a');

                }

                case 9 -> {

                    FuncionesString.TransformaASCII(" ABCD");

                }

                case 10 -> {

                    FuncionesString.cuentaCaracteres("Ola, son alumno de DAM1, e son programador desde o 2021");

                }

                default -> {

                    seleccion=-1;

                }

            }

        }while(seleccion!=-1);




    }
}

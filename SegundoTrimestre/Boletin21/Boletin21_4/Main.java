package com.company;

public class Main {

    public static void main(String[] args) {

        //pedir dni
        int dni=FuncionesArray.askDni();

        //calcular resto
        int resto=FuncionesArray.calculateResto(dni);

        //buscar letra
        char letra=FuncionesArray.searchLetra(resto);

        FuncionesArray.showMessage("La letra del DNI '"+dni+"' es '"+letra+"', Con lo que el DNI completo seria: '"+dni+letra+"'");



    }
}

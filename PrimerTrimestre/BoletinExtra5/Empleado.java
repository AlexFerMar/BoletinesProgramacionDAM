package com.DAM;

import java.text.DecimalFormat;

enum Categoria {
    Principal,
    Asociado,
    Auxiliar
}

enum Postgrado {
    Ninguno,
    Maestria,
    Doctorado,
    Ambas
}

public class Empleado {
    private String codigo;
    private String nome;
    private Categoria categoria;
    private Postgrado postgrado;
    private int anhoAntiguedad;
    private int horasClase;
    private double porEstudios;
    private double porAntiguedad;
    private double sueldoBruto;
    private double sueldoNeto;
    private final double AFP = 0.13;
    private final double SALUD = 0.05;
    private final double HORA_PRINCIPAL = 25.00;
    private final double HORA_ASOCIADO = 25.00;
    private final double HORA_AUXILIAR = 25.00;


    public Empleado(String codigo, String nome, Categoria categoria, Postgrado postgrado, int anhoAntiguedad, int horasClase) {
        this.codigo = codigo;
        this.nome = nome;
        this.categoria = categoria;
        this.postgrado = postgrado;
        this.anhoAntiguedad = anhoAntiguedad;
        this.horasClase = horasClase;
    }

    public void calculateAntiguedad() {
        if (categoria == Categoria.Principal) {
            if (anhoAntiguedad >= 8) porAntiguedad = 0.07;
            else porAntiguedad = 0.05;
        } else if (categoria == Categoria.Asociado) {
            if (anhoAntiguedad >= 8) porAntiguedad = 0.06;
            else porAntiguedad = 0.04;
        } else if (anhoAntiguedad >= 8) porAntiguedad = 0.05;
        else porAntiguedad = 0.02;
    }

    public void calculateEstudios() {

        if (categoria == Categoria.Principal) {
            if (postgrado == Postgrado.Ambas) porEstudios = 0.25;
            else if (postgrado == Postgrado.Doctorado) porEstudios = 0.20;
            else if (postgrado == Postgrado.Maestria) porEstudios = 0.17;
            else porEstudios = 0.00;

        } else if (categoria == Categoria.Asociado) {
            if (postgrado == Postgrado.Ambas) porEstudios = 0.20;
            else if (postgrado == Postgrado.Doctorado) porEstudios = 0.15;
            else if (postgrado == Postgrado.Maestria) porEstudios = 0.10;
            else porEstudios = 0.00;

        } else {
            if (postgrado == Postgrado.Ambas) porEstudios = 0.20;
            else if (postgrado == Postgrado.Doctorado) porEstudios = 0.12;
            else if (postgrado == Postgrado.Maestria) porEstudios = 0.08;
            else porEstudios = 0.00;
        }
    }

    public void calculateBruto() {

        double pagaParcial;
        if (categoria == Categoria.Principal) {
            pagaParcial = horasClase * HORA_PRINCIPAL;

        } else if (categoria == Categoria.Asociado) {
            pagaParcial = horasClase * HORA_ASOCIADO;

        } else {
            pagaParcial = horasClase * HORA_AUXILIAR;
        }

        sueldoBruto = pagaParcial * (1 + porAntiguedad + porEstudios);
    }

    public void calculateNeto() {
        sueldoNeto = sueldoBruto * (1 - AFP - SALUD);
    }

    @Override
    public String toString() {
        DecimalFormat formateador = new DecimalFormat("#####.##");
        return "Estos son los datos del empleado de codigo '" + codigo + "':" +
                "\n   Nombre: '" + nome + '\'' +
                "\n   La categoria del empleado es " + categoria +
                "\n   Los estudios de postgrado del empleado han sido " + postgrado +
                "\n   El empleado tiene una antiguedad en esta universidad de " + anhoAntiguedad + " años" +
                "\n   Las horas impartidas por el empleado este mes han sido: " + horasClase +
                "\n   Bonificacion por estudios del empleado:" + formateador.format(porEstudios * 100) + "%" +
                "\n   Bonificacion por antiguedad del empleado: " + formateador.format(porAntiguedad * 100) + "%" +
                "\n   Sueldo bruto cobrado este mes: " + formateador.format(sueldoBruto) + "€" +
                "\n   Sueldo neto cobrado este mes: " + formateador.format(sueldoNeto) + "€" +
                "\n   Descuento por AFP: " + formateador.format(AFP * 100) + "%" +
                "\n   Descuento por seguro de salud: " + formateador.format(SALUD * 100) + "%";
    }
}



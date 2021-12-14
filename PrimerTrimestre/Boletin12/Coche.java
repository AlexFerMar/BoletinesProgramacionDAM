package com.DAM;

public class Coche {
    private String matricula;
    private int horaEntrada;
    private int horaSalida;
    private int minutoEntrada;

    public Coche() {
    }

    public Coche(String matricula, int horaEntrada, int minutoEntrada) {
        this.matricula = matricula;
        this.horaEntrada = horaEntrada;
        this.minutoEntrada = minutoEntrada;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getHoraEntrada() {
        return horaEntrada;
    }

    public void setHoraEntrada(int horaEntrada) {
        this.horaEntrada = horaEntrada;
    }

    public int getMinutoEntrada() {
        return minutoEntrada;
    }

    public void setMinutoEntrada(int minutoEntrada) {
        this.minutoEntrada = minutoEntrada;
    }



}

package com.company;

public class Main {

    public static void main(String[] args) {

        Gato albertWhiskers= new Gato();
        Papagaio papagaio=new Papagaio();
        Avestruz avestruz=new Avestruz();
        Morcego murcielago=new Morcego();
        Tigre tigre=new Tigre();

       albertWhiskers.camiñar();
       albertWhiskers.nadar();

       murcielago.camiñar();
       murcielago.vuela();

       tigre.camiñar();
       tigre.nadar();

       papagaio.camiñar();
       papagaio.vuela();

       avestruz.camiñar();
    }
}
